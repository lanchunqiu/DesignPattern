package com.lancq.behaviorpattern.observer;

/**
 * @Author lancq
 * @Description 具体的目标类
 * @Date 2018/4/28
 **/
public class ConcreteSubject extends Subject{
    private String subjectName;
    private String state;


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
    public void notifyObserver(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
}
