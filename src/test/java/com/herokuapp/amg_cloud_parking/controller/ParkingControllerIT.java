package com.herokuapp.amg_cloud_parking.controller;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import com.herokuapp.amg_cloud_parking.controller.dto.ParkingDTO;

import io.restassured.RestAssured;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ParkingControllerIT {

    @LocalServerPort
    private int randomPort;

    @BeforeEach
    public void setUpTest(){
        System.out.println("Random Port = " + randomPort);
        RestAssured.port = randomPort;

    }

    @Test
    void whenFindAllThenCheckResult() {
        RestAssured.given()
        .when()
        .get("/parking")
        .then()
        .body("license[1]", Matchers.equalTo("ABC-1234"));

    }

    @Test
    void whenCreateThenCheckIsCreated() {

        var createDTO = new ParkingDTO();
        createDTO.setLicense("AMG-1111");
        createDTO.setColor("PRETO");
        createDTO.setModel("Mercedes Benz");
        createDTO.setState("SP");
        createDTO.setCheckIn(LocalDateTime.now());
        createDTO.setCheckOut(LocalDateTime.now().plusHours(1));
        createDTO.setBill(10.0);
    
        RestAssured.given()
        .when()
        .contentType(MediaType.APPLICATION_JSON_VALUE)
        .body(createDTO)
        .post("/parking")
        .then()
        .statusCode(HttpStatus.SC_CREATED);


    }


}
