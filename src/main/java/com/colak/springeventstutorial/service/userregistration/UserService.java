package com.colak.springeventstutorial.service.userregistration;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRegistrationPublisher publisher;

    public void register(String userName, String email) {
        // Simulate the main process of registering users...

        // publish a register success event
        publisher.publishEvent(userName, email);
    }

}
