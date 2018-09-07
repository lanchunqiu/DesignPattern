package com.lancq.creational_pattern.factory.factorymethod;
/**
 * @Author lancq
 * @Description 具体工厂类
 * @Date 2018/4/25
 **/
public class HairTVFactory implements TVFactory{
	@Override
	public TV produceTV() {
		System.out.println("海尔电视工厂 生产 海尔电视");
		return new HairTV();
	}

}
