package com.lancq.behaviorpattern.strategy.demo;

public class Test {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextOperation();

        //
        context = new Context(new ConcreteStrategyB());
        context.contextOperation();
    }
}
