FROM openjdk:8-jdk-alpine
COPY target/spring-aws-deployment.jar spring-aws-deployment.jar
ENTRYPOINT ["java","-jar","/spring-aws-deployment.jar"]