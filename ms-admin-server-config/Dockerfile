FROM openjdk:17
LABEL authors="Noodlexz"
EXPOSE 8888
RUN mkdir -p /app/
ADD build/libs/ms-admin-server-config-0.0.1-SNAPSHOT.jar /app/ms-admin-server-config-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/ms-admin-server-config-0.0.1-SNAPSHOT.jar"]
