FROM eclipse-temurin:17
COPY target/DockerApp.jar DockerApp.jar
CMD ["java", "-jar", "DockerApp.jar"]