package com.herokuapp.amg_cloud_parking.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Component
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
      return new OpenAPI()
              .info(new Info()
                      .title("Cloud Parking - REST API")
                      .description("Cloud Parking API Documentation")
                      .version("1.0")
                      .termsOfService("Term of Use: Open Source")
                      .license(new License()
                              .name("Apache 2.0")
                              .url("https://www.apache.org/licenses/LICENSE-2.0.html")
                      )
              ).externalDocs(
                      new ExternalDocumentation()
                      .description("Cloud Parking")
                      .url("https://amg-cloud-parking-4b5ab8bf3004.herokuapp.com/"));
    }

}