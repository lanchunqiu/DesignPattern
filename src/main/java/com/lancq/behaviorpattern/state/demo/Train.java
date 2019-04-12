package com.lancq.behaviorpattern.state.demo;

/**
 * 上下文：火车
 */
public class Train {
    // 火车行驶
    public void run(){
        state.run(this);
    }

    private TrainState state;

    // 车速度
    private int speed;

    // 是否让行
    private boolean giveWay = false;

    public Train() {
        this.state = new StartState();
    }

    public TrainState getState() {
        return state;
    }

    public void setState(TrainState state) {
        this.state = state;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isGiveWay() {
        return giveWay;
    }

    public void setGiveWay(boolean giveWay) {
        this.giveWay = giveWay;
    }
}
