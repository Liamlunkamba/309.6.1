package com.example.demo.myServices;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

  @Override
  public String getFortune() {
     // TODO Auto-generated method stub
     return "Database connection";
  }
}