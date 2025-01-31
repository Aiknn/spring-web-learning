package com.yerlan.di.withoutSpring;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getHello(){
        return greetingService.sayHello();
    }
}

/*
    See ConstructorInjectedControllerTest which mimics Spring actions
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getHello() {
        System.out.println(controller.getHello());
    }
 */