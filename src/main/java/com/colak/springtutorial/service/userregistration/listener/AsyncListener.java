package com.colak.springtutorial.service.userregistration.listener;

import com.colak.springtutorial.service.userregistration.User;
import com.colak.springtutorial.service.userregistration.UserEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AsyncListener {

    // Runs in async-n thread
    @EventListener
    @Order(2)
    @Async("myAsyncPoolTaskExecutor")
    public void sendEmail(UserEvent event) {
        User user = event.user();
        log.info("Thread: {} . Send Email to: {}", Thread.currentThread().getName(), user.email());
    }

    // Runs in async-n thread
    @EventListener
    @Order(3)
    @Async("myAsyncPoolTaskExecutor")
    public void pointsGiving(UserEvent event) {
        User user = event.user();
        log.info("Thread: {} . Giving 1000 points to: {}", Thread.currentThread().getName(), user.userName());
    }
}
