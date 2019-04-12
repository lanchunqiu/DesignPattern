package com.lancq.behaviorpattern.strategy.demo;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class Context {
    private Strategy strategy;

    //构造方法
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    //上下文操作
    public void contextOperation(){
        this.strategy.operation();
    }
}
