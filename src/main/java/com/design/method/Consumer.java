package com.design.method;

public class Consumer {
    public static void main(String[] args) {

        Car car = new MoBaiFacatory().getCar();
        Car car2 = new WuLingFactory().getCar();

        car.name();
        car2.name();
    }
}
