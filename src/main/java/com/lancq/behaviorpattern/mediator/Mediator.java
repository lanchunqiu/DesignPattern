package com.lancq.behaviorpattern.mediator;

/**
 * 抽象中介者角色
 * @author lancq
 */
public abstract class Mediator {

    /**
     * 注册
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param msg
     * @param c
     */
    public abstract void forward(String msg, Colleague c);
}
