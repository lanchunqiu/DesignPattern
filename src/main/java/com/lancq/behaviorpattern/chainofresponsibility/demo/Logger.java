package com.lancq.behaviorpattern.chainofresponsibility.demo;

/**抽象处理者角色
 *
 * @author lancq
 */
public abstract class Logger {
    protected LogLevel logMask;
    protected Logger next;

    public Logger(LogLevel mask) {
        this.logMask = mask;
    }

    public Logger setNext(Logger nextLogger) {
        this.next = nextLogger;
        return nextLogger;
    }

    public void message(String msg, LogLevel severity) {
        if (logMask == severity) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, severity);
        }
    }

    abstract protected void writeMessage(String msg);

}
