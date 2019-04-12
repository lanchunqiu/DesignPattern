package com.lancq.behaviorpattern.chainofresponsibility.demo;

/**
 * 具体处理请求角色
 *
 * @author lancq
 */
public class ConsoleLogger extends Logger {

    public ConsoleLogger(LogLevel mask) {
        super(mask);
    }

    @Override
    protected void writeMessage(String msg) {
        System.err.println("Writing to console: " + msg);
    }
}
