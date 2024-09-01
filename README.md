# Spring Boot Demo for Apache OpenDAL

```shell
mvn spring-boot:run
```

APIs:

```shell
curl -i -F "file=@arch2.png" http://127.0.0.1:8080/api/v1/upload
curl http://127.0.0.1:8080/api/v1/download/arch2.png --output download.png
```
