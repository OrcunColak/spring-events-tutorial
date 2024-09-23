package com.colak.springeventstutorial.service.userregistration.listener;

import com.colak.springeventstutorial.service.userregistration.User;
import com.colak.springeventstutorial.service.userregistration.UserEvent;
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
        User user = (User) event.getSource();
        log.info("Thread: {} . Registered User : {}", Thread.currentThread().getName(), user.getEmail());
    }
}
