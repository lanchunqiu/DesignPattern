package com.lancq.behavior_pattern.command.demo;

import java.util.HashMap;

/**
 * 控制开关（调用者角色）
 * @author lancq
 */
public class Switch {
    private final HashMap<String ,Command> commandMap = new HashMap<>();

    public void register(String cname, Command command){
        this.commandMap.put(cname, command);
    }

    public void execute(String cname){
        Command command = this.commandMap.get(cname);
        if (command == null) {
            throw new IllegalStateException("no command registered for " + cname);
        }
        command.execute();
    }
}
