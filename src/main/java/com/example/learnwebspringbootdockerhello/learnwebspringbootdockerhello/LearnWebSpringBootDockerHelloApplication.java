package com.example.learnwebspringbootdockerhello.learnwebspringbootdockerhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class LearnWebSpringBootDockerHelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnWebSpringBootDockerHelloApplication.class, args);
    }

    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        return String.format("You message: %s", message);
    }
}
