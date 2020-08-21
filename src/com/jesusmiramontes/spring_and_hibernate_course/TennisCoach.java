package com.jesusmiramontes.spring_and_hibernate_course;

public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
