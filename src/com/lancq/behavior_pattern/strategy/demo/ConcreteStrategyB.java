package com.lancq.behavior_pattern.strategy.demo;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class ConcreteStrategyB extends Strategy {
    @Override
    public void operation() {
        System.out.println("The operation of Strategy B");
    }
}
