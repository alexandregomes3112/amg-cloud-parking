# [EN](./README_EN.md) - ![EN](./src/main/resources/static/img/us.svg) | [ES](./README_ES.md) - ![ES](./src/main/resources/static/img/es.svg)

# AMG Cloud Parking - PT - ![PT](./src/main/resources/static/img/br.svg)

AMG Cloud Parking é um projeto de API REST baseado em Java desenvolvido como parte do projeto DIO Java. Este projeto fornece um sistema de gerenciamento de estacionamento com funcionalidades para criar, atualizar, excluir e recuperar registros de estacionamento. Ele também inclui documentação do Swagger para fácil exploração e teste da API.

## Índice
- [EN -  | ES - ](#en-----es---)
- [AMG Cloud Parking - PT - ](#amg-cloud-parking---pt---)
  - [Índice](#índice)
  - [Características](#características)
  - [Tecnologias usadas](#tecnologias-usadas)
  - [Configuração e instalação](#configuração-e-instalação)
  - [Executando o aplicativo](#executando-o-aplicativo)
  - [Disponibilidade On Line](#disponibilidade-on-line)

## Características

- Crie um novo registro de estacionamento
- Recuperar todos os registros de estacionamento
- Recuperar um registro de estacionamento por ID
- Atualizar um registro de estacionamento
- Excluir um registro de estacionamento
- Calcule a conta do estacionamento com base nos horários de check-in e check-out
- UI Swagger para documentação e testes de API

## Tecnologias usadas

-Java 17
- Inicialização Primavera 3.4.1
- JPA de dados Spring
- Banco de dados H2 (para teste)
- PostgreSQL (para produção)
- Arrogância (springdoc-openapi)
- JUnit 5
- Tenha certeza
- Contêineres de teste

## Configuração e instalação

1. **Clone o repositório:**

 ```bash
 clone https://github.com/seunomedeusuario/amg-cloud-parking.git
cd amg-cloud-parking
```

1. **Construa o projeto**
```sh
mvn clean install
```

1. **Configure o banco de dados**
Atualize o arquivo `application.properties` com sua configuração de banco de dados.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Executando o aplicativo

1. **Execute o aplicativo**
   
```sh
mvn spring-boot:run
```

1. **Acesse o aplicativo**
O aplicativo estará disponível em `http://localhost:8080`
`USER` e `PASSWORD` são `user` e `1234` respectivamente

1. **SWAGGER**
A documentação da API está disponível em `http://localgost:8080/swagger-ui.html`

##Licença
Este projeto é licenciado sob a Licença MIT. Veja o arquivo [LICENSE](./LICENSE) para detalhes

## Disponibilidade On Line
Este projeto é implantado neste link público: [CLOUD PARKING API](https://amg-cloud-parking-4b5ab8bf3004.herokuapp.com/swagger-ui/index.html)
Este aplicativo foi desenvolvido para fins educacionais, portanto, este link pode ficar indisponível a qualquer momento. Se necessário, entre em contato comigo.

Entre em contato comigo no LinkedIn

[![Linkedin](./src/main/resources/static/img/linkedin.svg)](https://www.linkedin.com/in/alexandre-gomes-98815027/) Alexandre Gomes