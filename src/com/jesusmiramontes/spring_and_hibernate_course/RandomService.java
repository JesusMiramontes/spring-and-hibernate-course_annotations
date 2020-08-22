package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
