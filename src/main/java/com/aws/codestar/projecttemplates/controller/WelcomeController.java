package com.aws.codestar.projecttemplates.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
