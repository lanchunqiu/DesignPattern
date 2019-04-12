package com.lancq.behaviorpattern.state.demo;

public class Client {
    public static void main(String[] args) {
        Train train = new Train();
        train.setSpeed(0);
        train.run();

        train.setSpeed(100);
        train.run();

        train.setSpeed(150);
        train.run();

        train.setSpeed(210);
        train.run();

        train.setSpeed(200);
        train.run();

        train.setGiveWay(true);
        train.run();
    }
}
