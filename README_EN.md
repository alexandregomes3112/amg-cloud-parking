# AMG Cloud Parking - EN - ![EN](./src/main/resources/static/img/us.svg)


AMG Cloud Parking is a Java-based REST API project developed as part of the DIO Java project. This project provides a parking management system with functionalities to create, update, delete, and retrieve parking records. It also includes Swagger documentation for easy API exploration and testing.

## Table of Contents

- [AMG Cloud Parking - EN - ](#amg-cloud-parking---en---)
  - [Table of Contents](#table-of-contents)
  - [Features](#features)
  - [Technologies Used](#technologies-used)
  - [Setup and Installation](#setup-and-installation)
  - [Running the application](#running-the-application)
  - [On Line Availability](#on-line-availability)

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
