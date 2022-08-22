package com.mkj.movieapp.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieCatalogAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogAppApplication.class, args);
	}

}
