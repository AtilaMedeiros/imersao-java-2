FROM openjdk:17-jdk-slim-bullseye
RUN apt-get update && apt-get install -y --no-install-recommends \
    openjdk-17-jdk \
    && rm -rf /var/lib/apt/lists/*
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/linguagem-api-0.0.1-SNAPSHOT.jar linguagemapi.jar
EXPOSE 8080
ENTRYPOINT exec java $JAVA_OPTS -jar linguagemapi.jar

#FROM openjdk:17-jdk-alpine (Linux-x86)

# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar linguagemapi.jar
