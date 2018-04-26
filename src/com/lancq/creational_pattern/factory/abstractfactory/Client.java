package com.lancq.creational_pattern.factory.abstractfactory;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class Client {

	public static void main(String[] args) {
	    //定义出两个工厂
        AbstractFactory factory1 = new Factory1(); 
        
        AbstractFactory factory2 = new Factory2();

        //产生A1对象
        AbstractProductA a1 =  factory1.produceProductA();
        
        //产生A2对象
        AbstractProductA a2 = factory2.produceProductA();
        
        //产生B1对象
        AbstractProductB b1 = factory1.produceProductB();
        
        //产生B2对象
        AbstractProductB b2 = factory2.produceProductB();
        
        a1.shareMethod();
        a1.doSomething();
        
        a2.shareMethod();
        a2.doSomething();
        
        b1.shareMethod();
        b1.doSomething();
        
        b2.shareMethod();
        b2.doSomething();
	}

}
