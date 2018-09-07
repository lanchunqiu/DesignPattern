package com.lancq.structure_pattern.adapter.classadapter;

/**
 * @Author lancq
 * @Description 需要被适配的类
 * @Date 2018/5/13
 **/
public class Adaptee {
    /**
     * 需要被适配的方法
     */
    public void specificRequest(){
        System.out.println("客户发起的特殊请求");
    }
}
