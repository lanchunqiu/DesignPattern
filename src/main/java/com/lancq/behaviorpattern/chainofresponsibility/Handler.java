package com.lancq.behaviorpattern.chainofresponsibility;

/**
 *  处理请求接口
 *
 * @author lancq
 */
public abstract class Handler {
    protected Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 抽象处理请求方法
     * @param request
     */
    public abstract void handleRequest(String request);
}
