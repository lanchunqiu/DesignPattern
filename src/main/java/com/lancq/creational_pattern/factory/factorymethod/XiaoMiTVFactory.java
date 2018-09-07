package com.lancq.creational_pattern.factory.factorymethod;
/**
 * @Author lancq
 * @Description 具体工厂类
 * @Date 2018/4/25
 **/
public class XiaoMiTVFactory implements TVFactory{
	@Override
	public TV produceTV() {
		System.out.println("小米电视工厂 生产 小米电视");
		return new XiaoMiTV();
	}

}
