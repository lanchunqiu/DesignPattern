package com.lancq.behavior_pattern.state.demo;

/**
 * 具体状态类：火车启动状态
 */
public class StartState extends TrainState {
    @Override
    public void run(Train train) {
        if (train.getSpeed() == 0){
            System.out.println("当前时速为：" + train.getSpeed() + "列车开始启动");
        } else {
            train.setState(new FastState());
            train.run();
        }
    }
}
