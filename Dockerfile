FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/TestWallet1-1.0-SNAPSHOT.jar wallet-service.jar
ENTRYPOINT ["java","-jar","/wallet-service.jar"]