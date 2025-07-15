package com.example.restribbonserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private Environment environment;

    @GetMapping("/message")  
    public String getMessage() {
        String port = environment.getProperty("local.server.port");
        return "✅ Hello  I am Avinash !! Host: localhost | Port: " + port;
    }

    @GetMapping("/backend")
    public String backendView() {
        String port = environment.getProperty("local.server.port");
        return "✅ This is  my lab /backend from port: " + port;
    }
}
