package com.lancq.creational_pattern.factory.factorymethod;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class HairTV implements TV{
    @Override
    public void play() {
        System.out.println("海尔电视播放...");
    }

}
