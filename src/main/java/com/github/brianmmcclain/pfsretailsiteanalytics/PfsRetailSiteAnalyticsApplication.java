package com.github.brianmmcclain.pfsretailsiteanalytics;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PfsRetailSiteAnalyticsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfsRetailSiteAnalyticsApplication.class, args);
	}

	@Bean
	public Function<String, String> cartAdd() {
		return s -> "added";
	} 

	@Bean
	public Function<String, String> cartRemove() {
		return s -> "removed";
	}
}
