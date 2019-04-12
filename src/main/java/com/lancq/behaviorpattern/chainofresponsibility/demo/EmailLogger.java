package com.lancq.behaviorpattern.chainofresponsibility.demo;

/**
 * 具体处理请求角色
 *
 * @author lancq
 */
public class EmailLogger extends Logger {

    public EmailLogger(LogLevel mask) {
        super(mask);
    }

    @Override
    protected void writeMessage(String msg) {
        System.err.println("Sending via email: " + msg);
    }
}
