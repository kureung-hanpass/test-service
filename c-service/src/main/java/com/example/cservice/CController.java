package com.example.cservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CController {
    @GetMapping("/hello")
    public String hello() {
        return "hello3";
    }
}
