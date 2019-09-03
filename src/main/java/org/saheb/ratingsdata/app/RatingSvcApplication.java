package org.saheb.ratingsdata.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="org.saheb.ratingsdata")
public class RatingSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingSvcApplication.class, args);
	}

}
