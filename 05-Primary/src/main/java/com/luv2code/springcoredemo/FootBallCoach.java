package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class FootBallCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "practice Goal keeping";
    }
}
