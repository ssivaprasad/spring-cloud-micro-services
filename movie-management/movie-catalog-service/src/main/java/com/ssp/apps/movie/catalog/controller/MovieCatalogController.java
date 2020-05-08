package com.ssp.apps.movie.catalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieCatalogController {

    @GetMapping
    public String checkStatus() {
        return "Working..!!!, Movie Catalog Service";
    }
}
