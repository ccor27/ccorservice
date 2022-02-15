FROM openjdk:17
MAINTAINER cristianOsorio
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} /customer.jar
ENTRYPOINT ["java", "-jar", "/customer.jar"]