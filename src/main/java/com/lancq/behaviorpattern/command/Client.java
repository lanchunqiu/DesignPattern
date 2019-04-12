package com.lancq.behaviorpattern.command;

/**
 * 客户端
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();

        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        //客户端调用调用者的call方法
        invoker.call();
    }
}
