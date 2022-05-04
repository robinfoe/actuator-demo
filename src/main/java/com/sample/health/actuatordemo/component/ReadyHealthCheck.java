package com.sample.health.actuatordemo.component;

import com.sample.health.actuatordemo.component.base.BaseHealthCheck;

import org.springframework.stereotype.Component;


@Component("ready")
public class ReadyHealthCheck extends BaseHealthCheck{

    @Override
    protected boolean isRunning() {
        // implement logic here
        return true;
    }

    @Override
    protected String getServiceName() {
        return "ready";
    }
    
}
