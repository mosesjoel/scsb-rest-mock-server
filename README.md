## NYPL-REST- Mock-Server

   A NYPL mock  server imitates a real server by providing realistic responses to requests. Dynamic response can make your mock API more realistic. Responses can be static or dynamic, and simulate the data the real API would return, matching the schema with data types, objects, and arrays. The data can be randomly generated based on the type of field and requirements you determine. For getting the request and sending the response it uses RESTful API Services.
   
## Software Required

      - Java 11
      - Docker 19.03.13  
    
## Prerequisite

1. **external-rest-application.properties**
    
      - spring.datasource.url=<JDBC-URL>
      - spring.datasource.driver-class-name=<JDBC-Driver>
      - spring.datasource.username=
      - spring.datasource.password=
      - spring.jpa.properties.hibernate.dialect=<DB-Dialect>
   
2. Update the below Property Values in scsb_properteis_t table. 
   
      - UPDATE `recap`.`scsb_properties_t` SET `P_VALUE`='http://${DOCKERIPOFNYPLMOCKSERVER}:<Port>/rest' WHERE `P_KEY`='ils.rest.data.api' AND `INSTITUTION_CODE`=<Institution-code>;
   
## Build

Download the Project , navigate inside project folder and build the project using below command

**mvn clean install -DskipTests=true**

## Docker Image Creation

Naviagte Inside project folder where Dockerfile is present and Execute the below command

**sudo docker build -t phase4-scsb-rest-mock-server .**

## Docker Run

User the below command to Run the Docker

**sudo docker run --name phase4-scsb-rest-mock-server -v <volume> -p <port-configuration> -e "ENV= -Dorg.apache.activemq.SERIALIZABLE_PACKAGES="*" -Dspring.config.location=<config-file-location>" -d phase4-scsb-rest-mock-server**
