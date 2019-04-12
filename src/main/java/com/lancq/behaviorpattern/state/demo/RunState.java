package com.lancq.behaviorpattern.state.demo;

/**
 * 具体状态：火车匀速行驶状态
 */
public class RunState extends TrainState {
    @Override
    public void run(Train train) {
        if (train.isGiveWay()){
            train.setState(new StopState());
            train.run();
        } else {

            System.out.println("当前时速为：" + train.getSpeed() + "列车正在匀速行驶");
        }
    }
}
