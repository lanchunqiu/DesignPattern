package com.lancq.behaviorpattern.observer.mouse;

import java.lang.reflect.Method;

/**
 * @Author lancq
 * @Description 事件
 * @Date 2018/4/28
 **/
public class Event {

    //事件源
    private Object  source;

    //通知目标
    private Object  target;

    //回调
    private Method callback;

    //触发
    private String trigger;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    //
    public Object getSource() {
        return source;
    }

    public void setSource(Object  source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source='" + source + '\'' +
                ", target='" + target + '\'' +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                '}';
    }

}
