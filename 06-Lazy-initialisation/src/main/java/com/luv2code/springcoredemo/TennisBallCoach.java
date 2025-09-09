package com.luv2code.springcoredemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class TennisBallCoach implements Coach{

    public TennisBallCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practice tennice ball game...";
    }
}
