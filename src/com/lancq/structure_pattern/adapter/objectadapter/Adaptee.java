package com.lancq.structure_pattern.adapter.objectadapter;

/**
 * @Author lancq
 * @Description 需要被适配的类
 * @Date 2018/4/27
 **/
public class Adaptee {

    public void specificRequest(){
        System.out.println("客户发起的特殊请求");
    }
}
