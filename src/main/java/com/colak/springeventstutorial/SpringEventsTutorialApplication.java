package com.colak.springeventstutorial;

import com.colak.springeventstutorial.service.userregistration.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootApplication
public class SpringEventsTutorialApplication implements CommandLineRunner {

	private ApplicationEventPublisher eventPublisher;
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringEventsTutorialApplication.class, args);
	}

	@Autowired
	public void setEventPublisher(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void run(String... args) {
		eventPublisher.publishEvent("Test event");
		userService.register("orcun", "test@gmail.com");
	}


}
