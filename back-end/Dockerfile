#
# Build stage
#
FROM eclipse-temurin:17-jdk-alpine
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /target/adoteumpet-0.0.1-SNAPSHOT.jar adoteumpet.jar
ENV PORT 8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","adoteumpet.jar"]