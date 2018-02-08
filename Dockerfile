FROM openjdk

LABEL a01.product="javasdk"
LABEL a01.index.schema="v2"

COPY . /azure-libraries-for-java
COPY ./app /app