package com.colak.springtutorial.service.userregistration.listener;

import com.colak.springtutorial.service.userregistration.User;
import com.colak.springtutorial.service.userregistration.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SyncListener {

    @EventListener
    @Order(1)
    public void register(UserEvent event) {
        User user = event.user();
        log.info("Thread: {} . Registered User : {}", Thread.currentThread().getName(), user.email());
    }
}
