package com.esprit.microservice.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controllerTest {
    @GetMapping("/test")
    public String test(){
        return "Test OK";
    }
}
