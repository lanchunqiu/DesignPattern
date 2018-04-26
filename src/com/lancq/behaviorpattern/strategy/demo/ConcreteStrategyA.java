package com.lancq.behaviorpattern.strategy.demo;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class ConcreteStrategyA extends Strategy {
    @Override
    public void operation() {
        System.out.println("The operation of Strategy A");
    }
}
