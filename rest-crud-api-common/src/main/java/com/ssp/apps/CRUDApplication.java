package com.ssp.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class CRUDApplication {
    public static void main(String[] args) {
        System.setProperty("spring.mvc.pathmatch.matching-strategy", "ant_path_matcher");
        System.setProperty("spring.h2.console.enabled", "true");
        System.setProperty("logging.level.org.springframework.web", "DEBUG");
        System.setProperty("management.endpoints.web.exposure.include", "*");
        SpringApplication.run(CRUDApplication.class, args);
    }
}

