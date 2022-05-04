package com.sample.health.actuatordemo.component.base;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

public abstract class BaseHealthCheck implements HealthIndicator{

    @Override
    public Health health() {

        if(!this.isRunning()){
            return Health.down().withDetail(this.getServiceName(), "Not Available").build();
        }

        return Health.up().withDetail(this.getServiceName(), "OK").build();
    }
    
    abstract protected boolean isRunning();
    abstract protected String getServiceName();
    
}
