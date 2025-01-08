# [EN](#amg-cloud-parking---en---en) - ![EN](./src/main/resources/static/img/us.svg) | [ES](#amg-cloud-parking---es---es) - ![ES](./src/main/resources/static/img/es.svg) | [PT](#amg-cloud-parking---pt---pt) - ![BR](./src/main/resources/static/img/br.svg)


# AMG Cloud Parking - EN - ![EN](./src/main/resources/static/img/us.svg)

[🏠](#en---en--es---es--pt---br)

AMG Cloud Parking is a Java-based REST API project developed as part of the DIO Java project. This project provides a parking management system with functionalities to create, update, delete, and retrieve parking records. It also includes Swagger documentation for easy API exploration and testing.

## Table of Contents

- [EN -  | ES -  | PT - ](#en-----es-----pt---)
- [AMG Cloud Parking - EN - ](#amg-cloud-parking---en---)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Technologies Used](#technologies-used)
  - [Setup and Installation](#setup-and-installation)
  - [Running the application](#running-the-application)
  - [On Line Availability](#on-line-availability)
- [AMG Cloud Parking - ES - ](#amg-cloud-parking---es---)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Características](#características)
  - [Tecnologías Utilizadas](#tecnologías-utilizadas)
  - [Configuración e Instalación](#configuración-e-instalación)
  - [Ejecutar la Aplicación](#ejecutar-la-aplicación)
- [AMG Cloud Parking - PT - ](#amg-cloud-parking---pt---)
  - [Índice](#índice)
  - [Características](#características-1)
  - [Tecnologias usadas](#tecnologias-usadas)
  - [Configuração e instalação](#configuração-e-instalação)
  - [Executando o aplicativo](#executando-o-aplicativo)
  - [Disponibilidade On Line](#disponibilidade-on-line)

## Features

- Create a new parking record
- Retrieve all parking records
- Retrieve a parking record by ID
- Update a parking record
- Delete a parking record
- Calculate parking bill based on check-in and check-out times
- Swagger UI for API documentation and testing

## Technologies Used

- Java 17
- Spring Boot 3.4.1
- Spring Data JPA
- H2 Database (for testing)
- PostgreSQL (for production)
- Swagger (springdoc-openapi)
- JUnit 5
- RestAssured
- Testcontainers

## Setup and Installation

1. **Clone the repository:**

   ```bash
   git clone https://github.com/yourusername/amg-cloud-parking.git
   cd amg-cloud-parking

1. **Build the project**
   ```sh
   mvn clean install
   ```
1. **Configure the database**
   Update the `application.properties` file with your database configuration.

   ```
    spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
    spring.datasource.username=yourusername
    spring.datasource.password=yourpassword
    spring.datasource.driverClassName=org.postgresql.Driver
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
   ```

## Running the application

1. **Run the application**
```sh
mvn spring-boot:run
```

1. **Access the application**
   The application will be available at `http://localhost:8080`
   `USER` and `PASSWORD` are `user` and `1234` respectively 

1. **SWAGGER*
   The API Documentation areavailable at `http://localgost:8080/swagger-ui.html`

##License
This project is licensed under the MIT License. See the [LICENSE](./LICENSE) File for details

## On Line Availability
This project are deployed at this public link: [CLOUD PARKING API](https://amg-cloud-parking-4b5ab8bf3004.herokuapp.com/swagger-ui/index.html)
This application was developed for educational purposes, therefore, this link may be unavailable at any time. If necessary, please contact me.

Contact me on LinkedIn 

[![Linkedin](./src/main/resources/static/img/linkedin.svg)](https://www.linkedin.com/in/alexandre-gomes-98815027/)    Alexandre Gomes


# AMG Cloud Parking - ES - ![ES](./src/main/resources/static/img/es.svg)

[🏠](#en---en--es---es--pt---br)

AMG Cloud Parking es un proyecto de API REST basado en Java, desarrollado como parte del proyecto de Java de DIO. Este proyecto proporciona un sistema de gestión de estacionamiento con funcionalidades para crear, actualizar, eliminar y recuperar registros de estacionamiento. También incluye documentación Swagger para una fácil exploración y prueba de la API.

## Tabla de Contenidos

- [EN -  | ES -  | PT - ](#en-----es-----pt---)
- [AMG Cloud Parking - EN - ](#amg-cloud-parking---en---)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Technologies Used](#technologies-used)
  - [Setup and Installation](#setup-and-installation)
  - [Running the application](#running-the-application)
  - [On Line Availability](#on-line-availability)
- [AMG Cloud Parking - ES - ](#amg-cloud-parking---es---)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Características](#características)
  - [Tecnologías Utilizadas](#tecnologías-utilizadas)
  - [Configuración e Instalación](#configuración-e-instalación)
  - [Ejecutar la Aplicación](#ejecutar-la-aplicación)
- [AMG Cloud Parking - PT - ](#amg-cloud-parking---pt---)
  - [Índice](#índice)
  - [Características](#características-1)
  - [Tecnologias usadas](#tecnologias-usadas)
  - [Configuração e instalação](#configuração-e-instalação)
  - [Executando o aplicativo](#executando-o-aplicativo)
  - [Disponibilidade On Line](#disponibilidade-on-line)

## Características

- Crear un nuevo registro de estacionamiento
- Recuperar todos los registros de estacionamiento
- Recuperar un registro de estacionamiento por ID
- Actualizar un registro de estacionamiento
- Eliminar un registro de estacionamiento
- Calcular la tarifa de estacionamiento según los tiempos de entrada y salida
- Interfaz Swagger para documentación y pruebas de la API

## Tecnologías Utilizadas

- Java 17
- Spring Boot 3.4.1
- Spring Data JPA
- Base de Datos H2 (para pruebas)
- PostgreSQL (para producción)
- Swagger (springdoc-openapi)
- JUnit 5
- RestAssured
- Testcontainers

## Configuración e Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/yourusername/amg-cloud-parking.git
   cd amg-cloud-parking
   ```

1. **Compilar el proyecto:**
   ```sh
   mvn clean install
   ```

1. **Configurar la base de datos:**
Actualiza el archivo `application.properties` con la configuración de tu base de datos.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/yourdatabase
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Ejecutar la Aplicación

```sh
mvn spring-boot:run
```

1. **Acceder a la aplicación:**
La aplicación estará disponible en `http://localhost:8080`.
El `USUARIO` y la `CONTRASEÑA` son `user` y `1234`, respectivamente.

1. **SWAGGER:**
La documentación de la API estará disponible en `http://localhost:8080/swagger-ui.html`.

Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo [LICENSE](./LICENSE) para más detalles.

Disponibilidad en Línea
Este proyecto está desplegado en el siguiente enlace público: [CLOUD PARKING API](https://amg-cloud-parking-4b5ab8bf3004.herokuapp.com/swagger-ui/index.html).
Esta aplicación fue desarrollada con fines educativos, por lo que este enlace puede estar no disponible en cualquier momento. Si es necesario, por favor contáctame.

Contáctame en LinkedIn

[![Linkedin](./src/main/resources/static/img/linkedin.svg)](https://www.linkedin.com/in/alexandre-gomes-98815027/)    Alexandre Gomes


# AMG Cloud Parking - PT - ![PT](./src/main/resources/static/img/br.svg)


[🏠](#en---en--es---es--pt---br)


AMG Cloud Parking é um projeto de API REST baseado em Java desenvolvido como parte do projeto DIO Java. Este projeto fornece um sistema de gerenciamento de estacionamento com funcionalidades para criar, atualizar, excluir e recuperar registros de estacionamento. Ele também inclui documentação do Swagger para fácil exploração e teste da API.

## Índice

- [EN -  | ES -  | PT - ](#en-----es-----pt---)
- [AMG Cloud Parking - EN - ](#amg-cloud-parking---en---)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Technologies Used](#technologies-used)
  - [Setup and Installation](#setup-and-installation)
  - [Running the application](#running-the-application)
  - [On Line Availability](#on-line-availability)
- [AMG Cloud Parking - ES - ](#amg-cloud-parking---es---)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Características](#características)
  - [Tecnologías Utilizadas](#tecnologías-utilizadas)
  - [Configuración e Instalación](#configuración-e-instalación)
  - [Ejecutar la Aplicación](#ejecutar-la-aplicación)
- [AMG Cloud Parking - PT - ](#amg-cloud-parking---pt---)
  - [Índice](#índice)
  - [Características](#características-1)
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