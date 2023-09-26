FROM eclipse-temurin:20-alpine
VOLUME /tmp
COPY build/libs/perso-api-0.0.1-SNAPSHOT.jar perso-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/perso-api-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080