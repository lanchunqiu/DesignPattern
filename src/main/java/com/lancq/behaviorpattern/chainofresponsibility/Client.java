package com.lancq.behaviorpattern.chainofresponsibility;

/**
 * 客户端
 *
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        //提交请求
        handler1.handleRequest("second");
    }
}
