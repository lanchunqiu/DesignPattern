package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/27
 **/
public class Engineer implements Soldier {
    @Override
    public void executeCommand(String command) {
        System.out.println("工程兵：" + command );
    }
}
