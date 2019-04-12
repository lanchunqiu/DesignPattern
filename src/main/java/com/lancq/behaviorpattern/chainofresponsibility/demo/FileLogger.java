package com.lancq.behaviorpattern.chainofresponsibility.demo;

/**
 * 具体处理请求角色
 *
 * @author lancq
 */
public class FileLogger extends Logger {

    public FileLogger(LogLevel mask) {
        super(mask);
    }

    @Override
    protected void writeMessage(String msg) {
        System.err.println("Writing to Log File: " + msg);
    }
}
