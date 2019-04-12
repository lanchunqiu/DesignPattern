package com.lancq.behaviorpattern.mediator;

/**
 * 抽象同事角色
 * @author lancq
 */
public abstract class Colleague {
    protected Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    /**
     * 接收信息
     */
    public abstract void receive(String msg);

    /**
     * 发送信息
     * @param msg
     */
    public abstract void send(String msg);

}
