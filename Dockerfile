FROM openjdk:17
VOLUME /tmp

RUN groupadd spring && useradd spring -g spring
USER spring:spring
COPY ms-transaction-boot/target/ms-transaction-boot*.jar app.jar

ENTRYPOINT ["java","-jar", "/app.jar"]