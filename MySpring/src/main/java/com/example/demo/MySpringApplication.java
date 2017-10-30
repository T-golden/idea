package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class MySpringApplication extends SpringBootServletInitializer {
	
	private static final Logger logger = LoggerFactory.getLogger(MySpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MySpringApplication.class, args);
		logger.info("MySpringApplication Server Running");
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MySpringApplication.class);
    }
}
