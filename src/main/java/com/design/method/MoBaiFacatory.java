package com.design.method;

public class MoBaiFacatory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
