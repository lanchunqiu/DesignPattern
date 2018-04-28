package com.lancq.behavior_pattern.Observer;

/**
 * @Author lancq
 * @Description 具体观察者类
 * @Date 2018/4/28
 **/
public class ConcreteObserver extends Observer {

    private String observerName;
    private String state;
    private ConcreteSubject concreteSubject;

    public ConcreteObserver(String observerName, ConcreteSubject concreteSubject) {
        this.observerName = observerName;
        this.concreteSubject = concreteSubject;
    }

    public ConcreteSubject getConcreteSubject() {
        return concreteSubject;
    }

    public void setConcreteSubject(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
    }

    @Override
    public void update() {
        state = concreteSubject.getState();
        String subName = concreteSubject.getSubjectName();
        System.out.println("["+this.observerName + "]观察到[" + subName + "]状态是：" + state);
    }
}
