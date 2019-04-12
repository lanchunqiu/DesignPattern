package com.lancq.behaviorpattern.state.demo;

/**
 * 抽象状态类：火车状态
 */
public abstract class TrainState {
    public abstract void run(Train train);
}
