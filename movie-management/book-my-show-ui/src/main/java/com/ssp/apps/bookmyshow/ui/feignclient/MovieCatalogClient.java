package com.ssp.apps.bookmyshow.ui.feignclient;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("movie-catalog-service")
public interface MovieCatalogClient {

    @GetMapping("/movies")
    public List<String> getMovies();
}
