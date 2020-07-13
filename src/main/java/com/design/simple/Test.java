package com.design.simple;

public class Test {

    public static void main(String[] args) {
        /*WuLingCar car1 = new WuLingCar();
        BMW car2 = new BMW();*/
        Car car1 = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("BMW");
        car1.getName();
        car2.getName();

    }
}
