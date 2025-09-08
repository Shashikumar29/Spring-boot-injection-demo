package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisBallCoach implements Coach{


    @Override
    public String getDailyWorkout() {
        return "Practice tennice ball game...";
    }
}
