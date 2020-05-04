package com.ssp.apps.microservices.movieinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {

    @GetMapping
    public String checkStatus() {
        return "Working...!!!";
    }
}
