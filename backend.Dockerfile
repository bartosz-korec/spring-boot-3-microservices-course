# backend.backend.Dockerfile

# Stage 1: Build
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
# Define the argument for the module name
ARG MODULE_NAME
# Build specific module and its dependencies
RUN mvn clean package -DskipTests -pl ${MODULE_NAME} -am

# Stage 2: Runtime
FROM eclipse-temurin:21-jre
WORKDIR /app
ARG MODULE_NAME
# Copy the built jar from the module's target folder
COPY --from=build /app/${MODULE_NAME}/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]