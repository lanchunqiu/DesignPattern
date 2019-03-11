package com.lancq.structure_pattern.flyweight.demo1;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        int state = 100;
        Flyweight a = factory.getFlyweight("A");
        a.operation(state);
        Flyweight b = factory.getFlyweight("B");
        b.operation(state * 2);
        Flyweight c = factory.getFlyweight("C");
        c.operation(state * 3);
        Flyweight d = factory.getFlyweight("D");
        d.operation(state * 4);

        Flyweight x = new UnsharedFlyweight();
        x.operation(state/2);

        Flyweight y = new UnsharedFlyweight();
        y.operation(state/2);
    }
}
