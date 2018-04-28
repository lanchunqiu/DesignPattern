package com.lancq.behavior_pattern.Observer;

import java.util.ArrayList;

/**
 * @Author lancq
 * @Description 具体的目标类
 * @Date 2018/4/28
 **/
public class ConcreteSubject extends Subject{
    private String subjectName;
    private String state;
    //记录观察者列表
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public ConcreteSubject(String subjectName){
        this.subjectName = subjectName;
    }
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        this.notifyObserver();
        System.out.println();
    }
    @Override
    public void add(Observer observer){
        observers.add(observer);
    }
    @Override
    public void remove(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObserver(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
}
