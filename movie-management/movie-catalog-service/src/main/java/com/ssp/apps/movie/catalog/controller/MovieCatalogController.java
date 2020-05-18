package com.ssp.apps.movie.catalog.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie-catalog")
public class MovieCatalogController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private Environment environment;

    @GetMapping("checkstatus")
    public String checkStatus() {
        return "Working...!!!,  APP_NAME : " + appName + ", Up and Running on Port: "
                + environment.getProperty("local.server.port");
    }

    @GetMapping
    public List<String> getAllMovieNames() {
        return Arrays.asList("Ala vaikunthapurramuloo", "Sarileru Neekevvaru", "Bheeshma");
    }
}
