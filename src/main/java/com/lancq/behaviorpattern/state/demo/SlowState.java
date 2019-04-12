package com.lancq.behaviorpattern.state.demo;

/**
 * 具体状态：火车减速状态
 */
public class SlowState extends TrainState {
    @Override
    public void run(Train train) {
        if (train.getSpeed() > 200){
            System.out.println("当前时速为：" + train.getSpeed() + "列车正在减速");
        } else {
            train.setState(new RunState());
            train.run();
        }
    }
}
