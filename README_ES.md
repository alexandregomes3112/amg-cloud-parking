# AMG Cloud Parking - ES - ![ES](./src/main/resources/static/img/es.svg)


AMG Cloud Parking es un proyecto de API REST basado en Java, desarrollado como parte del proyecto de Java de DIO. Este proyecto proporciona un sistema de gestión de estacionamiento con funcionalidades para crear, actualizar, eliminar y recuperar registros de estacionamiento. También incluye documentación Swagger para una fácil exploración y prueba de la API.

## Tabla de Contenidos
- [AMG Cloud Parking - ES - ](#amg-cloud-parking---es---)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Características](#características)
  - [Tecnologías Utilizadas](#tecnologías-utilizadas)
  - [Configuración e Instalación](#configuración-e-instalación)
  - [Ejecutar la Aplicación](#ejecutar-la-aplicación)

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
