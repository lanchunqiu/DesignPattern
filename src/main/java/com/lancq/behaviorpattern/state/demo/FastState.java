package com.lancq.behaviorpattern.state.demo;

/**
 * 具体状态类：火车加速状态
 */
public class FastState extends TrainState {
    @Override
    public void run(Train train) {
        if (train.getSpeed() < 200){
            System.out.println("当前时速为：" + train.getSpeed() + "列车正在加速");
        } else {
            train.setState(new SlowState());
            train.run();
        }
    }
}
