package com.lancq.behavior_pattern.state;

public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.Handle();
        System.out.println("=================");
        context.Handle();
        System.out.println("=================");
        context.Handle();
    }
}
