# syntax=docker/dockerfile:1.3-labs

FROM maven:3-eclipse-temurin-8-alpine

# copy arthas
COPY --from=hengyunabc/arthas:latest /opt/arthas /opt/arthas

RUN sed -i 's/dl-cdn.alpinelinux.org/mirrors.aliyun.com/g' /etc/apk/repositories
RUN apk add wget unzip tcpdump ngrep iproute2-ss bind-tools

COPY <<EOF /root/.m2/settings.xml
<?xml version=\"1.0\"?>
<settings>
    <mirrors>
        <mirror>
            <id>alimaven</id>
            <name>aliyun maven</name>
            <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
            <mirrorOf>central</mirrorOf>
        </mirror>
        <mirror>
            <id>maven-default-http-blocker</id>
            <mirrorOf>!*</mirrorOf>
            <url>http://0.0.0.0/</url>
        </mirror>
    </mirrors>
</settings>
EOF

WORKDIR /app

COPY ./ ./

RUN --mount=type=cache,target=/root/.m2/repository/ \
  mvn clean package --batch-mode

EXPOSE 20002
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar /app/target/B.jar"]
