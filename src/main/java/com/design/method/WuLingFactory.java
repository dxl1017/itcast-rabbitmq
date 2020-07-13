package com.design.method;

public class WuLingFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new WuLing();
    }
}
