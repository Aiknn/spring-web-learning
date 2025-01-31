package com.yerlan.di.autowired;

import org.springframework.stereotype.Service;

@Service
public class OvenService implements HeatableService {
    @Override
    public String heat() {
        return "Oven is heating...";
    }
}
