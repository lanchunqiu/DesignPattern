package com.lancq.behavior_pattern.command;

/**
 * 命令调用者角色
 * @author lancq
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者发出命令...");
        this.command.execute();
    }
}
