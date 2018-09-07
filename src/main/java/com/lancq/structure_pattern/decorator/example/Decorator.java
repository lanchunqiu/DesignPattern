package com.lancq.structure_pattern.decorator.example;

/**
 * @Author lancq
 * @Description 装饰器类
 * @Date 2018/4/28
 **/
public class Decorator implements Vehicle {
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void run() {
        if(vehicle != null){
            vehicle.run();
        }
    }
}
