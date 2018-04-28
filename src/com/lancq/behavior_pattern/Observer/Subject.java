package com.lancq.behavior_pattern.Observer;

import java.util.ArrayList;

/**
 * @Author lancq
 * @Description 抽象的目标类
 * @Date 2018/4/28
 **/
public abstract class Subject {


    public abstract void add(Observer observer);

    public abstract void remove(Observer observer);

    public abstract void notifyObserver();
}
