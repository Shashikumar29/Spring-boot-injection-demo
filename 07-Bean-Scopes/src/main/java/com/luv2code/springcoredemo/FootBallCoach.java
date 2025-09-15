package com.luv2code.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

public class FootBallCoach implements Coach {

    public FootBallCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "practice Goal keeping";
    }
}
