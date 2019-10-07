FROM openjdk:11-jdk
WORKDIR /code
COPY /api /code
RUN ./mvnw package -Dmaven.test.skip=true
RUN cp target/spring-mysql-dockerized-0.0.1-SNAPSHOT.jar target/app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/code/target/app.jar"]
