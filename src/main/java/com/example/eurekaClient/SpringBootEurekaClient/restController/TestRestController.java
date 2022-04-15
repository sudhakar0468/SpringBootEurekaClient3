package com.example.eurekaClient.SpringBootEurekaClient.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @GetMapping("/v1/test")
    public String getHelloMessage(){
        return "Hi hello";
    }

    @GetMapping("/v1/eurekaClient3")
    public String getEurekaClient3(){
        return "Response From EurekaClient 3";
    }
}
