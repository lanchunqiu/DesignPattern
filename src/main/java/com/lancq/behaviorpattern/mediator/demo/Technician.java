package com.lancq.behaviorpattern.mediator.demo;

/**
 * 技术人员（具体交流者）
 * @author lancq
 */
public class Technician extends Communicator{
    public Technician(CustomerServer customerServer) {
        super(customerServer);
    }

    /**
     * 技术人员回复
     * @param msg
     */
    public void answer(String msg) {
        customerServer.communicate(msg, this);
    }

    /**
     * 技术人员获取问题
     * @param msg
     */
    public void getMessage(String msg) {
        System.out.println("顾客的质询问题：" + msg);
    }
}
