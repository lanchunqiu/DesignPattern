package com.lancq.behavior_pattern.mediator.demo;

/**
 * 抽象交流者
 * @author lancq
 */
public abstract class Communicator {

    protected CustomerServer customerServer;

    public Communicator( CustomerServer customerServer){
        this.customerServer = customerServer;
    }
}
