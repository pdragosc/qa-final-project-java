FROM maven:3.9-eclipse-temurin-17

WORKDIR /app

COPY pom.xml .
COPY config ./config
COPY data ./data
COPY src ./src

CMD ["mvn", "test"]
