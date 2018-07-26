FROM openjdk:8-alpine

WORKDIR /app

COPY . .

CMD ["java", "-jar", "/MySpringBoot-0.0.1-SNAPSHOT.jar"]
