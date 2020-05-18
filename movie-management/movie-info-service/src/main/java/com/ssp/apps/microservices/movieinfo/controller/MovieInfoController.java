package com.ssp.apps.microservices.movieinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ssp.apps.microservices.movieinfo.feignclient.MovieRatingClient;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private MovieRatingClient movieRatingClient;

    @GetMapping
    public String checkStatus() {
        String response = movieRatingClient.checkStatus();
        System.out.println("==== >> Response: " + response);
        return "Working...!!!, APP_NAME : " + appName;
    }
}
