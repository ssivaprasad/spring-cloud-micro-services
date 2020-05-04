package com.ssp.apps.microservices.movierating.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-rating")
public class MovieRatingController {

    @GetMapping
    public String checkStatus() {
        return "Working...!!!";
    }
}
