package com.lancq.creational_pattern.factory.factorymethod;

public class Client {
	public static void main(String[] args) {
        TV haierTV =  null; // 定义tv对象
        TVFactory hairTVFactory = new HairTVFactory(); // 定义工厂
        haierTV = hairTVFactory.produceTV(); // 创建电视对象
        haierTV.play(); // 播放电视

        TV tclTV =  null;
        TVFactory tclTVFactory = new TCLTVFactory();
        tclTV = tclTVFactory.produceTV();
        tclTV.play();

        TV xiaomiTV =  null;
        TVFactory xiaomiTVFactory = new XiaoMiTVFactory();
        xiaomiTV = xiaomiTVFactory.produceTV();
        xiaomiTV.play();
	}
}
