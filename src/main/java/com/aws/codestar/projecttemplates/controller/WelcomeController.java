package com.aws.codestar.projecttemplates.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {


    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String index() {
        return new JSONObject().put("Output", "Greetings from Spring Boot!").toString();
    }

}
