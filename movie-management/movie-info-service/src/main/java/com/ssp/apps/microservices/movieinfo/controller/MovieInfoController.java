package com.ssp.apps.microservices.movieinfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @Value("${app_name}")
    private String appName;

    @GetMapping
    public String checkStatus() {
        return "Working...!!!, APP_NAME : " + appName;
    }
}
