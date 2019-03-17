package com.lancq.behavior_pattern.state;

/**
 * 抽象状态类
 */
public abstract class State {
    public String stateName;
    public abstract void Handle(Context context);
}
