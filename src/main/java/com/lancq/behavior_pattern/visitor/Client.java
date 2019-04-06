package com.lancq.behavior_pattern.visitor;

/**
 * 客户端
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteElementA());
        objectStructure.add(new ConcreteElementB());

        Visitor visitorA = new ConcreteVisitorA();
        objectStructure.accept(visitorA);

        Visitor visitorB = new ConcreteVisitorB();
        objectStructure.accept(visitorB);
    }
}
