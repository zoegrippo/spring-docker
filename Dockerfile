FROM openjdk:8-alpine AS build

WORKDIR /app

COPY . .

FROM openjdk:8-alpine

WORKDIR /app

COPY --from=build /app/target/SpringBootExample-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/SpringBootExample-0.0.1-SNAPSHOT.jar"]
