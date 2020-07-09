package com.ssp.apps.library.manament.books;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserStatusController {

    @Value("${app.status.check.message}")
    private String appSrtatusCheckMessage;

    @GetMapping("/checkstatus")
    public String checkStatus() {
        return appSrtatusCheckMessage;
    }
}
