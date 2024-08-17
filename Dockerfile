# Download Java
FROM openjdk:21-jdk

# Working Directory as Variable
ENV APP_HOME=/app/backend

# Working Directory
WORKDIR $APP_HOME

# Copying jar file from local to container
COPY target/ToDoList-0.0.1-SNAPSHOT.jar $APP_HOME/ToDoList-0.0.1-SNAPSHOT.jar

# PORT
EXPOSE 8080

# Running appliaction
ENTRYPOINT ["java", "-jar", "/app/backend/ToDoList-0.0.1-SNAPSHOT.jar"]
