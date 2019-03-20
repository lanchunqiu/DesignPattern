package com.lancq.behavior_pattern.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("State1");
        System.out.println("初始状态:" + originator.getState());

        caretaker.setMemento(originator.createMemento()); //保存状态
        originator.setState("State2");
        System.out.println("新的状态:" + originator.getState());

        originator.restoreMemento(caretaker.getMemento()); //恢复状态
        System.out.println("恢复状态:" + originator.getState());
    }

}
