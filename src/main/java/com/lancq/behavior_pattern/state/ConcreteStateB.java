package com.lancq.behavior_pattern.state;

public class ConcreteStateB extends State {
    public ConcreteStateB() {
        stateName = "状态 B";
    }

    @Override
    public void Handle(Context context) {
        context.setState(new ConcreteStateA());
    }
}
