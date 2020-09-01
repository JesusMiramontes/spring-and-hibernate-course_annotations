package com.jesusmiramontes.spring_and_hibernate_course;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 100 meters";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
