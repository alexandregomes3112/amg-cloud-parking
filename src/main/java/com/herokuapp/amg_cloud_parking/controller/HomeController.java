package com.herokuapp.amg_cloud_parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Hidden;

@RestController
@RequestMapping("/")
@Hidden
public class HomeController {

    @GetMapping
    public String home() {
        return "Hello There !<br>General Kenobi !";
    }

}
