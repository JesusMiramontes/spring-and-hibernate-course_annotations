package com.jesusmiramontes.spring_and_hibernate_course;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Bummer";
    }
}
