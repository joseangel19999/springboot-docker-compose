FROM openjdk:8-jdk-alpine
MAINTAINER com.angelcode
#COPY target/classes/application.properties /app/application.properties
ARG JAR_FILE=target/appserviceclientesproductos.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]