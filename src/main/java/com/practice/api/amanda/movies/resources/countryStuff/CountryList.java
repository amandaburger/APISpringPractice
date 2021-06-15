/*
package com.practice.api.amanda.movies.resources.countryStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CountryList {
    @Autowired
    private RestTemplate restTemplatee;

    @Bean
    public RestTemplate restTemplatee(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/countries")
    public List<Country> getMovieInfo() {
        Country[] countries = restTemplatee.getForObject(
                "https://restcountries.eu/rest/v2/all",
                Country[].class);



        return  Arrays.asList(countries);
    }
}

*/