package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 狙击手
 * @Date 2018/4/27
 **/
public class Sniper implements Soldier {
    @Override
    public void executeCommand(String command) {
        System.out.println("狙击手：" + command );
    }
}
