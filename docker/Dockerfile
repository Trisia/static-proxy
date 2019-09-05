FROM openjdk:8-jre

RUN mkdir -p /www/html && \
    echo "OK" > /www/html/index.html

ADD target/static-proxy-1.0.0-SNAPSHOT.jar /app.jar

ENTRYPOINT ["java", "-jar", "-Duser.timezone=GMT+8", "/app.jar"]