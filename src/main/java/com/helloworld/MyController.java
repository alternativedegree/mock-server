package com.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(path = "/hello")
    String sayHello() {
        return "Hello";
    }
}
