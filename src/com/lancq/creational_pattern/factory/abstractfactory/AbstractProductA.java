package com.lancq.creational_pattern.factory.abstractfactory;
/**
 * @Author lancq
 * @Description 抽象产品类
 * @Date 2018/4/25
 **/
public abstract class AbstractProductA {
    //每个产品共有的方法
    public void shareMethod(){  
    	System.out.println("A产品的共有方法");
    }
    //每个产品相同方法，不同实现
    public abstract void doSomething(); 
}
