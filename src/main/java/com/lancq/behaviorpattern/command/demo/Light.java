package com.lancq.behaviorpattern.command.demo;

/**
 * 灯（命令接收者角色）
 * @author lancq
 */
public class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
