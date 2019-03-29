package com.lancq.behavior_pattern.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者角色
 * @author lancq
 */
public class ConcreteMediator extends Mediator{
    private List<Colleague> colleagueList = new ArrayList();

    @Override
    public void register(Colleague colleague) {
        if(!colleagueList.contains(colleague)){
            this.colleagueList.add(colleague);
            colleague.setMediator(this);
        }

    }

    @Override
    public void forward(String msg, Colleague c) {
        for(Colleague colleague : colleagueList) {
            if(!colleague.equals(c)) {
                colleague.receive(msg);
            }
        }
    }
}
