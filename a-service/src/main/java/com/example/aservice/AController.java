package com.example.aservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
