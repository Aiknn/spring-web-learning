package com.yerlan.di.context;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}

/*
        in main class:
        1) Spring creates context "ctx" for instances
        2) Through @Controller annotation Spring finds this class and creates "myController" bean
        3) after Spring creates instance/object of MyController class for us

        code for main class:

        ApplicationContext ctx = SpringApplication.run(DIApplication.class, args);
        MyController myController = (MyController) ctx.getBean("myController");
        String greetings = myController.sayHello();
 */
