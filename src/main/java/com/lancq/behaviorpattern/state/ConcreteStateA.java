package com.lancq.behaviorpattern.state;

public class ConcreteStateA extends State {
    public ConcreteStateA() {
        stateName = "状态 A";
    }

    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateB());
    }
}
