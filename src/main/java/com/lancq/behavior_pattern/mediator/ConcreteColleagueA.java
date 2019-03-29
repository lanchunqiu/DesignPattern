package com.lancq.behavior_pattern.mediator;

/**
 * 具体同时角色
 * @author lancq
 */
public class ConcreteColleagueA extends Colleague {

    @Override
    public void receive(String msg) {
        System.out.println("Colleague A got a message: " + msg);
    }

    @Override
    public void send(String msg) {
        mediator.forward(msg,this);
    }
}
