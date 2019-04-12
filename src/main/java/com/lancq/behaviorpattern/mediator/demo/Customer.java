package com.lancq.behaviorpattern.mediator.demo;

/**
 * 具体顾客类
 * @author lancq
 */
public class Customer extends Communicator{
    public Customer(CustomerServer customerServer) {
        super(customerServer);
    }

    /**
     * 提问
     * @param msg
     */
    public void ask(String msg) {
        customerServer.communicate(msg, this);
    }

    public void getMessage(String msg) {
        System.out.println("顾客得到技术人员的回复：" + msg);
    }
}
