package com.colak.springeventstutorial.service.userregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String userName, String email) {
        try {
            User user = new User(userName, email);

            System.out.println("Thread: " + Thread.currentThread().getName() + ". Registered User " + userName + " Success."
                               + " Publish a Event");
            applicationEventPublisher.publishEvent(new UserEvent(user, "Register"));

        } catch (Exception e) {
            System.out.println("publishEvent error" + e.getMessage());
        }
    }
}
