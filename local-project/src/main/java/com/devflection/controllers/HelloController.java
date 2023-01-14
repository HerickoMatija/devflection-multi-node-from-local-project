package com.devflection.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @Value("${app.instance-id}")
    private String applicationUuid;

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    @CrossOrigin(origins = "*")
    public String health() {
        return "Hello from " + applicationUuid;
    }

}
