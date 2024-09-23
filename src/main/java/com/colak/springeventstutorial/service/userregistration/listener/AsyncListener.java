package com.colak.springeventstutorial.service.userregistration.listener;

import com.colak.springeventstutorial.service.userregistration.User;
import com.colak.springeventstutorial.service.userregistration.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncListener {

    // Runs in async-n thread
    @EventListener(condition = "#event.type.equals('Register')")
    @Order(2)
    @Async("myAsyncPoolTaskExecutor")
    public void sendEmail(UserEvent event) {
        User user = (User) event.getSource();
        log.info("Thread: {} . Send Email to: {}", Thread.currentThread().getName(), user.getEmail());
    }

    // Runs in async-n thread
    @EventListener(condition = "#event.type.equals('Register')")
    @Order(3)
    @Async("myAsyncPoolTaskExecutor")
    public void pointsGiving(UserEvent event) {
        User user = (User) event.getSource();
        log.info("Thread: {} . Giving 1000 points to: {}", Thread.currentThread().getName(), user.getUserName());
    }
}
