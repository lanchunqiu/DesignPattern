package com.lancq.behaviorpattern.chainofresponsibility;

/**
 * 具体处理者1
 *
 * @author lancq
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("first")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                System.out.println(this.getClass().getCanonicalName() + "自身无法满足请求，转给下一个处理者！");
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
