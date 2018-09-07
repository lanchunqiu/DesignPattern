package com.lancq.structure_pattern.adapter.objectadapter;

/**
 * @Author lancq
 * @Description 适配器模式
 * 将一个类的接口转换成客户希望的另外一个接口，适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * @Date 2018/4/27
 **/
public class Test {

    public static void main(String[] args) {
        //客户基本请求
        Target target = new Target();
        target.request();

        System.out.println("------开始适配------");

        //客户的特殊请求，需要调用Adapter的方法

        target = new Adapter();
        target.request();
    }

}
