package com.lancq.creationalpattern.factory.abstractfactory;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/25
 **/
public class Factory2 extends AbstractFactory{
	
	@Override
	public AbstractProductA produceProductA() {
		System.out.println("【2级产品工厂】：生产2级产品A");
		return new ProductA2();
	}

	@Override
	public AbstractProductB produceProductB() {
		System.out.println("【2级产品工厂】：生产2级产品B");
		return new ProductB2();
	}

}
