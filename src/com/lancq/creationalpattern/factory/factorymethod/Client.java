package com.lancq.creationalpattern.factory.factorymethod;

public class Client {

	public static void main(String[] args) {
        TV tv; // 定义tv对象
        TVFactory factory = new HairTVFactory(); // 定义工厂
        //TVFactory factory = new TCLTVFactory(); // 定义工厂
        //TVFactory factory = new XiaoMiTVFactory(); // 定义工厂
        tv = factory.produceTV(); // 创建电视对象
        tv.play(); // 播放电视
	}

}
