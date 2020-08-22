package com.jesusmiramontes.spring_and_hibernate_course;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomService implements FortuneService {

    private String[] data = {"Buy lottery ticket.", "You will find money.", "Not today."};

    @Override
    public String getFortune() {
        Random r = new Random();
        return data[r.nextInt(data.length)];
    }
}
