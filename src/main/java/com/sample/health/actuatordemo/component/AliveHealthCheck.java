package com.sample.health.actuatordemo.component;

import com.sample.health.actuatordemo.component.base.BaseHealthCheck;

import org.springframework.stereotype.Component;

@Component("alive")
public class AliveHealthCheck extends BaseHealthCheck{

    @Override
    protected boolean isRunning() {
        // logicto check is running
        return true;
    }

    @Override
    protected String getServiceName() {
        return "alive";
    }
    
}
