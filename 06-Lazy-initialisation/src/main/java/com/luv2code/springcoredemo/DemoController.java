package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("footBallCoach") Coach thisCoach) {
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach = thisCoach;
    }

//    @Autowired
//    public void setMyCoach(@Qualifier("tennisBallCoach") Coach thisCoach) {
//        myCoach = thisCoach;
//    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkout();
    }
}
