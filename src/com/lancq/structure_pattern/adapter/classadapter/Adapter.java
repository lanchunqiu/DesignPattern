package com.lancq.structure_pattern.adapter.classadapter;

/**
 * @Author lancq
 * @Description 类适配器模式
 * 适配器Adapter继承自Adaptee，同时又实现了目标(Target)接口
 * @Date 2018/5/13
 **/

public class Adapter extends Adaptee implements Target {

    /**
     * 目标接口要求调用request()这个方法名，但源类Adaptee没有方法request()
     * 因此适配器补充上这个方法名
     * 但实际上request()只是调用源类Adaptee的specificRequest()方法的内容
     * 所以适配器只是将specificRequest()方法作了一层封装，封装成Target可以调用的request()而已
     */
    @Override
    public void request() {
        System.out.println("客户发起的普通请求");
        this.specificRequest();
    }
}
