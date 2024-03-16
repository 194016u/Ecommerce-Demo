package com.example.ecommercedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EcommerceDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceDemoApplication.class, args);
    }
    @GetMapping("/")
        public String getName(){
            return "Hello viranga";
        }


}
