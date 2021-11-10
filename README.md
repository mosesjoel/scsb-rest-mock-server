## NYPL-Mock-Server

   A NYPL mock  server imitates a real server by providing realistic responses to requests. Dynamic response can make your mock API more realistic. Responses can be static or dynamic, and simulate the data the real API would return, matching the schema with data types, objects, and arrays. The data can be randomly generated based on the type of field and requirements you determine. For getting the request and sending the response it uses RESTful API Services.
   
## Software Required

      - Java 11
      - Docker 19.03.13  
    
## Prerequisite

1. **external-rest-application.properties**
    
      - spring.datasource.url=jdbc:mysql://${MysqlDOckerIP}:3306/nypl?autoReconnect=true&serverTimezone=America/New_York&useSSL=false
      - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
      - spring.datasource.username=
      - spring.datasource.password=
      - spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
   
2. Update the below Property Values in scsb_properteis_t table. 
   
      - UPDATE `recap`.`scsb_properties_t` SET `P_VALUE`='http://${DOCKERIPOFNYPLMOCKSERVER}:9102/rest' WHERE `P_KEY`='ils.rest.data.api' AND `INSTITUTION_CODE`='NYPL';
   
## Build

Download the Project , navigate inside project folder and build the project using below command

**mvn clean install -DskipTests=true**

## Docker Image Creation

Naviagte Inside project folder where Dockerfile is present and Execute the below command

**sudo docker build -t phase4-scsb-rest-mock-server .**

## Docker Run

User the below command to Run the Docker

**sudo docker run --name phase4-scsb-rest-mock-server -v /data:/recap-vol -p 9102:9102 -e "ENV= -Dorg.apache.activemq.SERIALIZABLE_PACKAGES="*" -Dspring.config.location=/recap-vol/config/external-rest-application.properties " -d phase4-scsb-rest-mock-server**
