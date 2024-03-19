package com.colak.springeventstutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
public class SpringEventsTutorialApplication implements CommandLineRunner {

	private ApplicationEventPublisher eventPublisher;
	public static void main(String[] args) {
		SpringApplication.run(SpringEventsTutorialApplication.class, args);
	}

	@Autowired
	public void setEventPublisher(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Override
	public void run(String... args) {
		eventPublisher.publishEvent("Test event");
	}


}
