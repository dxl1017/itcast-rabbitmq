package com.design.simple;

public class CarFactory {

    public static Car getCar(String type){
        if (type.equals("五菱")){
            return new WuLingCar();
        }else if (type.equals("BMW")){
            return new BMW();
        }else {
            return null;
        }
    }
}

