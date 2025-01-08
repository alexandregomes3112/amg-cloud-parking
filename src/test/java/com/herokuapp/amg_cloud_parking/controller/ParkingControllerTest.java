package com.herokuapp.amg_cloud_parking.controller;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import com.herokuapp.amg_cloud_parking.controller.dto.ParkingCreateDTO;
import com.herokuapp.amg_cloud_parking.model.Parking;
import com.herokuapp.amg_cloud_parking.service.ParkingService;

import io.restassured.RestAssured;
import org.springframework.http.MediaType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ParkingControllerTest extends AbstractContainerBase {

    @LocalServerPort
    private int randomPort;

    @Autowired
    private ParkingService parkingService;

    @BeforeEach
    public void setUpTest(){
        System.out.println("Random Port = " + randomPort);
        RestAssured.port = randomPort;

        // Set up test data
        var parking = new Parking("1", "ABC-1234", "SP", "Meca One", "PRETO", LocalDateTime.now());
        parkingService.create(parking);

    }

    @Test
    void whenFindAllThenCheckResult() {
        RestAssured.given()
        .when()
        .get("/parking")
        .then()
        .statusCode(HttpStatus.SC_OK)
        .body("license[0]", Matchers.equalTo("ABC-1234"));

    }

    @Test
    void whenCreateThenCheckIsCreated() {
        var createDTO = new ParkingCreateDTO();
        createDTO.setLicense("XYZ-9876");
        createDTO.setState("RJ");
        createDTO.setModel("Tesla Model S");
        createDTO.setColor("BRANCO");

        RestAssured.given()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .body(createDTO)
            .when()
            .post("/parking")
            .then()
            .statusCode(HttpStatus.SC_CREATED)
            .body("license", Matchers.equalTo("XYZ-9876"))
            .body("state", Matchers.equalTo("RJ"))
            .body("model", Matchers.equalTo("Tesla Model S"))
            .body("color", Matchers.equalTo("BRANCO"));
    }


}
