package com.lancq.creational_pattern.factory.factorymethod;
/**
 * @Author lancq
 * @Description 具体工厂类
 * @Date 2018/4/25
 **/
public class TCLTVFactory implements TVFactory{
	@Override
	public TV produceTV() {
		System.out.println("TCL电视工厂 生产 TCL电视");
		return new TCLTV();
	}

}
