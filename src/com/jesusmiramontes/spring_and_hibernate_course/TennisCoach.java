package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//Spring will scan the files and register this bean automatically

/*
 * If we don't explicitly specify the component name spring will set a default name
 * This will be the name of the class in camel case starting with lower case
 */

@Component  // @Component("thatSillyCoach")
public class TennisCoach implements Coach{
    /*
    * When the AutoWired annotation is on a property.
    * Spring can access the properties even when they are private.
    * Uses Java reflection.
    * */
    @Autowired
    @Qualifier("randomService")
    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("Inside default constructor.");
    }

    // init method
    @PostConstruct
    public void postConstruct(){
        System.out.println("Inside postConstruct method");
    }

    // destroy method
    @PreDestroy
    public void destroyMethod(){
        System.out.println("Inside predestroy method");
    }

    //@Autowired // Autowired via constructor
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //@Autowired // Autowired via setter
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter.");
        this.fortuneService = fortuneService;
    }

    // Spring can Autowire to any method. Not necessary a setter.
    //@Autowired
    private void anyMethod(FortuneService fortuneService){
        System.out.println("Inside anyMethod.");
        this.fortuneService = fortuneService;
    }
}
