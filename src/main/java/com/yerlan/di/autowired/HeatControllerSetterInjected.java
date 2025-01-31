package com.yerlan.di.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HeatControllerSetterInjected {

    private HeatableService heatableService;

    @Autowired
    public void setHeatable(HeatableService heatableService) {
        this.heatableService = heatableService;
    }

    public String action(){
        return heatableService.heat();
    }
}
