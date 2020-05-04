package com.ssp.apps.microservices.movieinfo.repository;

import org.springframework.data.repository.CrudRepository;
import com.ssp.apps.microservices.movieinfo.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, String> {

}
