FROM openjdk:8-alpine

WORKDIR /app

COPY . .

CMD ["java", "-jar", "/app/SpringBootExample-0.0.1-SNAPSHOT.jar"]
