package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class FootBallCoach implements Coach {

    public FootBallCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice Goal keeping";
    }
}
