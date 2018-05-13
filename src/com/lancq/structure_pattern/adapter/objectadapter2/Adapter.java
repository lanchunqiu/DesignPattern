package com.lancq.structure_pattern.adapter.objectadapter2;

/**
 * @Author lancq
 * @Description 适配器类（对象适配器）
 * @Date 2018/4/27
 **/
public class Adapter implements Target {

    //包含一个私有的Adaptee对象
    private Adaptee adaptee = new Adaptee();

    //覆盖原有的request方法
    @Override
    public void request(){
        System.out.println("客户发起的普通请求");
        adaptee.specificRequest();
    }
}
