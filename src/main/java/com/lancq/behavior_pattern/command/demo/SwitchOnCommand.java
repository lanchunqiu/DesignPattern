package com.lancq.behavior_pattern.command.demo;

/**
 * 开灯（具体命令角色）
 * @author lancq
 */
public class SwitchOnCommand implements Command {
    private final Light light;

    public SwitchOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
