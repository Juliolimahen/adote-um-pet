#
# Build stage
#
FROM maven:3.8.6-eclipse-temurin-17-alpine AS build

#FROM maven:3.8.2-jdk-17 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM eclipse-temurin:17-alpine

COPY --from=build /target/adote-um-pet-0.0.1-SNAPSHOT.jar adote-um-pet.jar
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","adote-um-pet.jar"]