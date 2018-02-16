FROM maven:3.5.2-jdk-8-alpine

LABEL a01.product="javasdk"
LABEL a01.index.schema="v2"

LABEL a01.env.AZURE_CLIENT_ID="secret:client"
LABEL a01.env.AZURE_CLIENT_SECRET="secret:key"
LABEL a01.env.AZURE_TENANT_ID="secret:tenant"
LABEL a01.env.AZURE_SUBSCRIPTION_ID="secret:subscription"
LABEL a01.env.AZURE_TEST_MODE="arg-live:Record"

COPY . /azure-libraries-for-java
COPY ./app /app

RUN mvn install -DskipTests=true -f /azure-libraries-for-java/pom.xml -Dmaven.repo.local=/repository -q

CMD /app/a01droid