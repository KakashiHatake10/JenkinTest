package com.example.demo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mini1Application {

	private static final Logger log = LoggerFactory.getLogger(Mini1Application.class);

	@PostConstruct
	public void init() {
		log.info("applicatipon start");
	}

	public static void main(String[] args) {
		log.info("inside main1.1..............");
		log.info("inside main2...............");
		SpringApplication.run(Mini1Application.class, args);
	}

}
