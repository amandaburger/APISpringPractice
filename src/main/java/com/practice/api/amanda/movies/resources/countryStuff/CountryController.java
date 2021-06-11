/*
package com.practice.api.amanda.movies.resources.countryStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class CountryController {
    @Autowired
    CountryService countryService;


    //creating a get mapping that retrieves all the students detail from the database
    @GetMapping("/country")
    private List<Country> getAllCountries()
    {
        return countryService.getAllCountries();
    }

    @PostMapping("/country")
    private String saveCountry(@RequestBody Country country)
    {
        countryService.saveOrUpdate(country);
        return country.getName();
    }
}
*/
