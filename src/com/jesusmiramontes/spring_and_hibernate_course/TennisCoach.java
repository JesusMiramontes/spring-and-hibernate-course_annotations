package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.stereotype.Component;

//Spring will scan the files and register this bean automatically

/*
 * If we don't explicitly specify the component name spring will set a default name
 * This will be the name of the class in camel case starting with lower case
 */

@Component  // @Component("thatSillyCoach")
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
