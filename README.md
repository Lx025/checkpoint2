# Checkpoint 2 - Microservices e Engenharia Web (3º SI - 1º Semestre/2025)

## Sobre o Projeto

Este projeto é parte da avaliação do Checkpoint 1 da disciplina de **Microservices e Engenharia Web**, ministrada pelo professor Antonio Carlos de Lima Júnior. O objetivo é aplicar conceitos de arquitetura em microsserviços utilizando Spring Boot, seguindo as instruções e diagramas fornecidos.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.4.*
- Maven
- Spring Web
- Spring DevTools
- Swagger (springdoc-openapi)
- JUnit

## Estrutura do Projeto

O projeto foi gerado utilizando o [Spring Initializr](https://start.spring.io/) com as seguintes configurações:

- **Group:** `br.com.fiap`
- **Artifact:** `checkpoint2`
- **Name:** `checkpoint2`
- **Description:** `Checkpoint 2`
- **Package Name:** `br.com.fiap.checkpoint2`
- **Packaging:** `Jar`
- **Java Version:** 17

## Funcionalidades Entregues

### ✅ 1. Criação do Projeto Spring Boot

Projeto inicializado corretamente com as dependências necessárias e estrutura organizada.

### ✅ 2. Controllers e DTOs

As controllers e DTOs foram implementadas com base no Diagrama de Sequência fornecido. Cada endpoint segue as boas práticas de design RESTful.

### ✅ 3. Services

As camadas de serviço foram desenvolvidas de acordo com o Modelo Entidade-Relacionamento (MER), promovendo separação de responsabilidades e reusabilidade.


### ✅ 4. Documentação com Swagger

A documentação da API foi gerada utilizando Swagger. Após subir o projeto, é possível acessá-la via:

http://localhost:8080/swagger-ui/index.html


## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Viihcerq/checkpoint2
   
   cd checkpoint1

   ```
    ```
   mvn spring-boot:run
    ```


