
package com.practice.api.amanda.movies.resources.countryStuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    CountryRepository countryRepository;
    @Autowired
    RestTemplate restTeemplate;

    @Bean
    public RestTemplate restTeemplate(RestTemplateBuilder builder) {
        return builder.build();
    }



    public List<Country> getAllCountries ()
        {
            List<Country> countries = new ArrayList<Country>();
            countryRepository.findAll().forEach(country -> countries.add(country));
            return countries;
        }

        public void saveOrUpdate (Country country)
        {

            countryRepository.save(country);
        }
        public void initbruh ()
        {

            Country[] countries = restTeemplate.getForObject(
                    "https://restcountries.eu/rest/v2/all",
                    Country[].class);
            for (int i = 0; i < countries.length; i++) {
                countryRepository.save(countries[i]);
            }
        }

        public void saveOrUpdate (Country[]countries)
    {
        for (int i = 0; i < countries.length; i++) {
            countryRepository.save(countries[i]);
        }
    }

    }


