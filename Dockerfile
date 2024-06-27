# Use a base image that includes JDK
FROM openjdk:17-jdk-slim
# Set the working directory inside the container
WORKDIR /app
# Copy the built application JAR file into the container
COPY target/*.jar app.jar
# Expose the port the application will run on
EXPOSE 8080
# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]