FROM openjdk:17-jdk-slim

ARG PROFILES
ARG ENV

COPY build/libs/*-SNAPSHOT.jar /app.jar

#ENV DB_URL=${DB_URL}
#ENV DB_USER=${DB_USER}
#ENV DB_PASSWORD=${DB_PASSWORD}
#ENV JWT_SECRET_KEY=${JWT_SECRET_KEY}

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILES}", "-Dserver.env=${ENV}", "/app.jar"]