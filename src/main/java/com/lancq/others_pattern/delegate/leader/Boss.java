package com.lancq.others_pattern.delegate.leader;

/**
 * @Author lancq
 * @Description 委派模式（客户端）
 * @Date 2018/4/27
 **/
public class Boss {
    public static void main(String[] args){
        //客户端请求、委派者、被委派者
        //委派者要持有被委派者的引用
        //委派模式就是静态代理和策略模式的一种特殊的组合，代理模式注重的是过程，委派模式注重的是结果，策略模式注重的是扩展


        Leader leader = new Leader();
        leader.doSomething("加密");
        leader.doSomething("解密");
        leader.doSomething("支付");
    }
}
