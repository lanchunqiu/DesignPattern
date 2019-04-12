package com.lancq.behaviorpattern.strategy;

public class Context {
    private CalculatorStrategy strategy;

    //构造方法
    public Context(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    //上下文操作
    public int execute(int a, int b){
        return this.strategy.execute(a, b);
    }

    public CalculatorStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(CalculatorStrategy strategy) {
        this.strategy = strategy;
    }
}
