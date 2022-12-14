package com.ssp.apps.manage.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @Autowired
    private Environment environment;

    @GetMapping("/health-check")
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();

        response.put("application", environment.getProperty("spring.application.name"));
        response.put("port", environment.getProperty("local.server.port"));
        response.put("pid", environment.getProperty("PID"));
        response.put("status", "UP");

        return response;
    }
}
