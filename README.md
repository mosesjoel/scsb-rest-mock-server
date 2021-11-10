## NYPL-MockServer

   Receives and responds to SCSB requests
   
## Software Required

      - Java 11
      - Docker 19.03.13  
      
## Prerequisite

1. **external-rest-application.properties**
    
      - spring.datasource.url=
      - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
      - spring.datasource.username=
      - spring.datasource.password=
      - spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

## Build

Download the Project , navigate inside project folder and build the project using below command

**mvn clean install -DskipTests=true**

## Docker Image Creation

Naviagte Inside project folder where Dockerfile is present and Execute the below command

**sudo docker build -t phase4-scsb-rest-mock-server .**

## Docker Run

User the below command to Run the Docker

**sudo docker run --name phase4-scsb-rest-mock-server -v /data:/recap-vol -p 9102:9102 -e "ENV= -Dorg.apache.activemq.SERIALIZABLE_PACKAGES="*" -Dspring.config.location=/recap-vol/config/external-rest-application.properties " -d phase4-scsb-rest-mock-server**
