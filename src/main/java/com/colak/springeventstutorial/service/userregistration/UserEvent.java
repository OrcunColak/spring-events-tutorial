package com.colak.springeventstutorial.service.userregistration;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class UserEvent extends ApplicationEvent {

    private final String type;

    public UserEvent(Object source, String type) {
        super(source);
        this.type = type;
    }
}
