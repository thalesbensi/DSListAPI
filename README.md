# DSListAPI 🎮

DSListAPI é uma API RESTful desenvolvida em Java com Spring Boot para gestão de listas de jogos. O projeto permite cadastrar, listar e organizar jogos de forma estruturada, garantindo integração com banco de dados e um fluxo otimizado de manipulação de dados.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (Spring Web, Spring Data JPA, Spring Security)
- **Hibernate** (ORM)
- **Banco de Dados**: H2 (ambiente de desenvolvimento) e MySQL (produção)
- **Swagger/OpenAPI** (documentação da API)
- **Lombok** (para redução de boilerplate code)
- **Postman** (para testes de API)
- **Docker** (para conteinerização)

## Configuração do Projeto

### Clonando o Repositório

```sh
git clone https://github.com/thalesbensi/DSListAPI.git
cd DSListAPI
```

### Configurando o Banco de Dados

O projeto está configurado para rodar com um banco de dados H2 em ambiente de desenvolvimento. Para utilizar MySQL, ajuste o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dslist
spring.datasource.username=root
spring.datasource.password=senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

> Certifique-se de que o banco de dados MySQL está rodando e criado antes de iniciar a aplicação.

### Executando a API

Dentro da raiz do projeto, execute:

```sh
./mvnw spring-boot:run
```

A API será iniciada em `http://localhost:8080`.

## Endpoints Principais

### Jogos

#### Listar todos os jogos

```http
GET /games
```

#### Buscar jogo por ID

```http
GET /games/{id}
```

#### Adicionar um novo jogo

```http
POST /games
Content-Type: application/json
{
  "title": "Nome do Jogo",
  "platform": "Plataforma",
  "genre": "Gênero"
}
```

#### Atualizar um jogo

```http
PUT /games/{id}
Content-Type: application/json
{
  "title": "Nome Atualizado",
  "platform": "Plataforma",
  "genre": "Gênero"
}
```

#### Deletar um jogo

```http
DELETE /games/{id}
```

### Listas de Jogos

#### Listar todas as listas de jogos

```http
GET /lists
```

#### Buscar uma lista por ID

```http
GET /lists/{id}
```

#### Criar uma nova lista de jogos

```http
POST /lists
Content-Type: application/json
{
  "name": "Nome da Lista"
}
```

#### Atualizar uma lista de jogos

```http
PUT /lists/{id}
Content-Type: application/json
{
  "name": "Nome Atualizado da Lista"
}
```

#### Deletar uma lista de jogos

```http
DELETE /lists/{id}
```

## Testes

Você pode testar os endpoints utilizando o Postman ou o Swagger acessando:

```
http://localhost:8080/swagger-ui.html
```

**Desenvolvido por [Thales Bensi](https://github.com/thalesbensi)**
