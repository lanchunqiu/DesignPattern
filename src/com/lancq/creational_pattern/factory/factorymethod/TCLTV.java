package com.lancq.creational_pattern.factory.factorymethod;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class TCLTV implements TV{

    @Override
    public void play() {
        System.out.println("TCL电视播放...");
    }

}