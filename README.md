# Digital Innovation One

## Meeting Room REST API

### 🖱 [Clique aqui para ver online.][meeting-room-rest-api]

---

### 📑 Instruções

Para executar o projeto são necessários os seguintes pré-requisitos:

- Java 11 ou versões superiores.
- Maven 3.6.3 ou versões superiores.

Para executar o projeto, digite o seguinte comando na raiz do projeto:

```console
mvn spring-boot:run
```

Para acessar a REST API, utilize o seguinte *endpoint*:

```console
http://localhost:8080/api/v1/rooms
```

---

### ⚙ REST API

| Endpoint: | Method: | Descrição: | Response Status Code: |
|-----------|---------|--------------|-----------------------|
| /rooms | GET  | Retorna uma lista com todas as salas. | 200 / 404 |
| /rooms/{id} | GET | Retorna uma sala específica. | 200 / 404 |
| /rooms | POST | Cria uma nova entidade Room no sistema. | 201 / 404 |
| /rooms/{id} | PUT | Edita uma sala específica. | 200 / 404 |
| /rooms/{id} | DELETE | Deleta uma sala específica. | 204 / 404 |

---

### 📚 Referências

- [Java SE Development Kit 15 Download](https://www.oracle.com/java/technologies/javase-jdk15-downloads.html)
- [Maven](https://maven.apache.org/)

- [Spring Boot](https://spring.io/projects/spring-boot)

- [Documentação oficial do Lombok](https://projectlombok.org/)
- [Referência para o padrão arquitetural REST](https://restfulapi.net/)

[meeting-room-rest-api]:https://dio-rooms-api.herokuapp.com/api/v1/rooms