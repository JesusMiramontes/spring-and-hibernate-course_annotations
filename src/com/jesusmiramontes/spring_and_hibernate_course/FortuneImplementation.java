package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.stereotype.Component;

@Component
public class FortuneImplementation implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day.";
    }
}
