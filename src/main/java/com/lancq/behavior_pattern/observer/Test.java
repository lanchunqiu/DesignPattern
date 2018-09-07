package com.lancq.behavior_pattern.observer;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class Test {
    public static void main(String[] args) {
        ConcreteSubject shenzhouX = new ConcreteSubject("神舟10号飞船");
        shenzhouX.add(new ConcreteObserver("远望1号观测船",shenzhouX));
        shenzhouX.add(new ConcreteObserver("远望2号观测船",shenzhouX));
        shenzhouX.add(new ConcreteObserver("远望3号观测船",shenzhouX));

        shenzhouX.setState("飞船进入轨道");
        shenzhouX.setState("姿态调整");
        shenzhouX.setState("展开太阳能板");
    }
}
