package com.lancq.behaviorpattern.mediator.demo;

/**
 * 抽象客服人员
 * @author lancq
 */
public abstract class CustomerServer {
    /**
     * 抽象沟通方法
     * @param msg 信息
     * @param communicator 交流者
     */
    public abstract void communicate(String msg, Communicator communicator);
}
