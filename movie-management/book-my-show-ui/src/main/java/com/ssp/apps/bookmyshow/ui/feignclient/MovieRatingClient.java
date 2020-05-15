package com.ssp.apps.bookmyshow.ui.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("movie-rating-service")
public interface MovieRatingClient {

    @GetMapping("/movie-rating")
    public String getRating();
}
