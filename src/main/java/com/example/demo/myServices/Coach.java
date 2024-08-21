package com.example.demo.myServices;

import org.springframework.stereotype.Service;

@Service
public interface Coach {
    public String getDailyWorkout();
    public String getDailyFortune();

}
