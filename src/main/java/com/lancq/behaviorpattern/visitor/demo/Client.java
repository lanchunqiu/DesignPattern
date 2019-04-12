package com.lancq.behaviorpattern.visitor.demo;

/**
 * 客户端类
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
