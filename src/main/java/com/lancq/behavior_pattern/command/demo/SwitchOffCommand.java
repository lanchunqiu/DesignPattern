package com.lancq.behavior_pattern.command.demo;

/**
 * 关灯（具体命令角色）
 * @author lancq
 */
public class SwitchOffCommand implements Command {
    private final Light light;

    public SwitchOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
