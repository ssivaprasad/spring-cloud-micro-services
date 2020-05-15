package com.ssp.apps.bookmyshow.ui.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ssp.apps.bookmyshow.ui.feignclient.MovieCatalogClient;
import com.ssp.apps.bookmyshow.ui.feignclient.MovieRatingClient;

@Controller
@RequestMapping("/")
public class UIController {

    @Autowired
    private MovieCatalogClient movieCatalogClient;

    @Autowired
    private MovieRatingClient movieRatingClient;;

    @GetMapping
    public String home(ModelMap model) {
        OAuth2Authentication authentication =
                (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("principal", authentication);
        return "home";
    }

    @GetMapping("/loadmovies")
    public String loadmovies(ModelMap model) {
        List<String> movies = movieCatalogClient.getMovies();
        movies = movies.stream().map(name -> {
            String rating = movieRatingClient.getRating();
            return name + " : " + rating;
        }).collect(Collectors.toList());

        model.addAttribute("movies", movies);
        return "movielist";
    }

}
