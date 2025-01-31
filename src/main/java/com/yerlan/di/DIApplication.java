package com.yerlan.di;

import com.yerlan.di.autowired.HeatControllerSetterInjected;
import com.yerlan.di.context.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DIApplication.class, args);

        HeatControllerSetterInjected heatControllerSetterInjected = (HeatControllerSetterInjected) ctx.getBean("heatControllerSetterInjected");
        String info = heatControllerSetterInjected.action();
        System.out.println(info);



    }

}
