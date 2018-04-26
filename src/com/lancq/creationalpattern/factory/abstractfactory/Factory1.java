package com.lancq.creationalpattern.factory.abstractfactory;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class Factory1 extends AbstractFactory{
	
	
	@Override
	public AbstractProductA produceProductA() {
		System.out.println("【1级产品工厂】：生产1级产品A");
		return new ProductA1();
	}

	@Override
	public AbstractProductB produceProductB() {
		System.out.println("【1级产品工厂】：生产1级产品B");
		return new ProductB1();
	}

}
