package com.lancq.structure_pattern.decorator.example;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        BMWCarDecorator decorator = new BMWCarDecorator();
        decorator.setVehicle(car);
        decorator.run();
    }
}
