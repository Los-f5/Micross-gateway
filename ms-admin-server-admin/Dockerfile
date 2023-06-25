FROM openjdk:17
LABEL authors="Noodlexz"
EXPOSE 8890
RUN mkdir -p /app/
ADD build/libs/ms-admin-server-admin-0.0.1-SNAPSHOT.jar /app/ms-admin-server-admin-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/ms-admin-server-admin-0.0.1-SNAPSHOT.jar"]
