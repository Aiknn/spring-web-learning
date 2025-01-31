package com.yerlan.di.withoutSpring;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello without Spring";
    }
}
