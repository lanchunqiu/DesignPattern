package com.lancq.behavior_pattern.state.demo;

/**
 * 具体状态：火车停止让行状态
 */
public class StopState extends TrainState {
    @Override
    public void run(Train train) {
        System.out.println("当前时速为：" + train.getSpeed() + "列车准备停止让行");
    }
}
