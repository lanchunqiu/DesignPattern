package com.lancq.behaviorpattern.mediator;

/**
 * 客户端
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();

        ConcreteColleagueA ca = new ConcreteColleagueA();
        ca.setMediator(concreteMediator);

        ConcreteColleagueB cb = new ConcreteColleagueB();
        cb.setMediator(concreteMediator);

        concreteMediator.register(ca);
        concreteMediator.register(cb);

        ca.send("Hello, I am A!");
        cb.send("Hello, I am B!");
    }
}
