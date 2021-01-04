package com.ssp.apps.library.manament;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryStatusController {

    @Value("${app.status.check.message}")
    private String appStatusCheckMessage;

    @GetMapping("/checkstatus")
    public String checkStatus() {
        return appStatusCheckMessage;
    }
}
