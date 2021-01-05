package com.ssp.apps.library.manament;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class HealthCheckController {

    @Value("${app.status.check.message}")
    private String appStatusCheckMessage;

    @GetMapping("/healthcheck")
    public String checkStatus() {
        return appStatusCheckMessage;
    }
}
