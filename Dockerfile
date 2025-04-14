FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8080

LABEL mentainer="ram.singh01@nagarro.com"

WORKDIR /app

#COPY target/DockerAssignment-0.0.1-SNAPSHOT.jar /app/docker-assignment.jar
COPY target/docker-assignment.jar /app/docker-assignment.jar

ENTRYPOINT ["java", "-jar", "docker-assignment.jar"]