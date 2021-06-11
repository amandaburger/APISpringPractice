package com.practice.api.amanda.movies;

import com.practice.api.amanda.movies.resources.countryStuff.Country;
import com.practice.api.amanda.movies.resources.countryStuff.CountryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application{
	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	RestTemplate restTTemplate;

	@Bean
	public RestTemplate restTTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner demo(CountryRepository repository) {
		return (args) -> {
			repository.save(new Country(1000, "amanda", "45678", "56789", 12));
			Country[] countries = restTTemplate.getForObject(
					"https://restcountries.eu/rest/v2/all",
					Country[].class);
			for (int i = 0; i < countries.length; i++) {
				repository.save(countries[i]);
			}
			//repository.save(countries[1]);
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Country country : repository.findAll()) {
				log.info(country.toString());
			}
			log.info("");
		};

		}


}
