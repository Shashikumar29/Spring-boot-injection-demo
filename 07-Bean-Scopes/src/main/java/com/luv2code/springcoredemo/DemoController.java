package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach otherCoach;

    @Autowired
    public DemoController(@Qualifier("footBallCoach") Coach thisCoach, @Qualifier("footBallCoach") Coach otherCochObj) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = thisCoach;
        otherCoach = otherCochObj;
    }

//    @Autowired
//    public void setMyCoach(@Qualifier("tennisBallCoach") Coach thisCoach) {
//        myCoach = thisCoach;
//    }


    @GetMapping("/dailyWorkout")
    public String getDailyWorkOut() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/checkScope")
    public String checkBeansSCope() {
        return "Comparing beans scope, myCoach==OtherCoach: "+(myCoach==otherCoach);
    }

}
