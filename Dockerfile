FROM openjdk

COPY . /azure-libraries-for-java
COPY ./app /app
chmod -R 777 /app