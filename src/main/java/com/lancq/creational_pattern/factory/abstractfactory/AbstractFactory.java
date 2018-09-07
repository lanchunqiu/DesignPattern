package com.lancq.creational_pattern.factory.abstractfactory;
/**
 * @Author lancq
 * @Description 抽象工厂
 * @Date 2018/4/25
 **/
public abstract class AbstractFactory {
	
	public abstract AbstractProductA produceProductA();
	
	public abstract AbstractProductB produceProductB();
}
