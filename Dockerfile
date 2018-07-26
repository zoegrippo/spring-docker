FROM openjdk:8-alpine

WORKDIR /app

COPY . .

CMD ["java", "-jar", "/app/MySpringBoot-0.0.1-SNAPSHOT.jar"]
