package com.practice.api.amanda.movies.resources.movieStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/movies")
public class MovieList {

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/{movieID}")
    public Movie getMovieInfo(@PathVariable("movieID") String movieID) {
        MovieSummary z = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/"+movieID+"?api_key="+apiKey,
                MovieSummary.class);

        return new Movie(movieID,z.getTitle(),z.getOverview());
    }

}
