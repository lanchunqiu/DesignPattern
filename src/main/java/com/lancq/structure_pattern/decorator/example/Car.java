package com.lancq.structure_pattern.decorator.example;

/**
 * @Author lancq
 * @Description 轿车
 * @Date 2018/4/28
 **/
public class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("轿车行驶");
    }
}
