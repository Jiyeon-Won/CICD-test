FROM openjdk:17-jdk-slim

ARG JAR_FILE=build/libs/*-SNAPSHOT.jar
ARG PROFILES
ARG ENV

COPY ${JAR_FILE} /app.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "/app.jar"]