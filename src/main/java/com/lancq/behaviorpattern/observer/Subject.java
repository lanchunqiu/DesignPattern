package com.lancq.behaviorpattern.observer;

import java.util.ArrayList;

/**
 * @Author lancq
 * @Description 抽象的目标类
 * @Date 2018/4/28
 **/
public abstract class Subject {
    //记录观察者列表
    protected ArrayList<Observer> observers = new ArrayList<Observer>();

    public void add(Observer observer){
        observers.add(observer);
    }
    public void remove(Observer observer){
        observers.remove(observer);
    }

    public abstract void notifyObserver();
}
