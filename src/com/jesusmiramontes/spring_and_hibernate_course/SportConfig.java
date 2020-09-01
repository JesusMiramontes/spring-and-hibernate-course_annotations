package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // This indicates this is a configuration file
//@ComponentScan("com.jesusmiramontes.spring_and_hibernate_course") // This indicates which packages classes will be scanned for annotations
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for swim coach and inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }

}
