# Book Manager

# Pré-requisitos

* Java 1.8

# Uso

## Servidor aplicação
A execução do servidor de aplicação pode ser feita com o Maven ou Gradle:
* Maven: `mvnw spring-boot:run`
* Gradle: `gradlew bootRun`


# Banco de dados

O banco de dados usado é o H2, que roda em memória. Portanto ao parar a aplicação, seus dados são perdidos.

## Visualização dos dados

- Rode o servidor de aplicação
- Acesse `http://localhost:8080/h2-console/`
- Altere o campos:
  - JDBC URL: `jdbc:h2:mem:testdb`
  - Driver Class: `orgh2.Driver`
  - User name: `sa`
  - Password: (Não preencher)
