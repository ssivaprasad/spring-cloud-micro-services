package com.ssp.apps.crud.api.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @Autowired
    private Environment environment;

    @Autowired
    @Qualifier("healthCheckProperties")
    private Map<String, String> healthCheckProperties;

    @GetMapping("/health-check")
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();

        response.put("status", "UP");
        response.put("application", environment.getProperty("spring.application.name"));
        response.put("pid", environment.getProperty("PID"));
        response.put("port", environment.getProperty("local.server.port"));
        response.put("heath.check.message", healthCheckProperties.get("message"));

        return response;
    }
}
