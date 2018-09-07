package com.lancq.behavior_pattern.observer.mouse;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author lancq
 * @Description 事件注册和监听
 * @Date 2018/4/28
 **/
public class EventListener {
    //Map相当于是一个注册器
    protected Map<Enum,Event> events = new HashMap<Enum,Event>();

    public void addListener(Enum eventType, Object target, Method callback){
        //注册事件
        //用反射调用这个方法
        events.put(eventType, new Event(target, callback));
    }

    protected void trigger(Enum call){
        if(!this.events.containsKey(call)){ return;}

        Event event = this.events.get(call);
        event.setTrigger(call.toString());
        System.out.println("event = [" + event + "]");
        trigger(event);
    }

    private void trigger(Event event) {
        event.setSource(this);
        try {
            event.getCallback().invoke(event.getTarget(), event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
