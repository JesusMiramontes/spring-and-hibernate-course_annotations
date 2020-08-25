package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {
        // load spring file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // Check if they are the same
        boolean result = (theCoach == alphaCoach);

        // print result
        System.out.println("\n Pointing to the same object: " + result);
        System.out.println("\n Memory location for theCoach" + theCoach);
        System.out.println("\n Memory location for alphaCoach" + alphaCoach);
    }
}
