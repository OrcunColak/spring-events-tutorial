package com.colak.springeventstutorial.eventlistener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyEventListener {

    @EventListener
    public void handleMyEvent(String event) {
        log.info("Event received : {}", event);
    }

    // This event does not come
    @EventListener
    public void handleContextStart(ContextStartedEvent event) {
        log.info("Context Started Event Received");
    }

    @EventListener
    public void handleContextRefresh(ContextRefreshedEvent event) {
        log.info("Context Refreshed Event Received");
    }

    // This event does not come
    @EventListener
    public void handleContextClose(ContextClosedEvent event) {
        log.info("Context Closed Event Received");
    }

    // This event does not come
    @EventListener
    public void handleApplicationStarting(ApplicationStartingEvent event) {
        log.info("ApplicationStartingEvent Received: Application is starting up.");
    }

    // This event does not come
    @EventListener
    public void handleApplicationEnvironmentPrepared(ApplicationEnvironmentPreparedEvent event) {
        log.info("ApplicationEnvironmentPreparedEvent Received: Environment is prepared.");
    }

    // Indicates that the application is ready to service requests.
    @EventListener
    public void handleApplicationReady(ApplicationReadyEvent event) {
        log.info("Application Ready Event Received");
    }
}
