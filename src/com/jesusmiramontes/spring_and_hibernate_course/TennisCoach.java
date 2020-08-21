package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.stereotype.Component;

//Spring will scan the files and register this bean automatically

@Component("thatSillyCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
