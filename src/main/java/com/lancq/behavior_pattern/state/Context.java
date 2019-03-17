package com.lancq.behavior_pattern.state;

/**
 * 环境类（上下文）
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        System.out.println("当前状态为：" + this.state.stateName);
        this.state = state;
        System.out.println("状态变更为：" + this.state.stateName);
    }

    public void Handle(){
        this.state.Handle(this);
    }
}
