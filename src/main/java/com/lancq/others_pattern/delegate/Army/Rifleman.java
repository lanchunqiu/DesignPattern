package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 步枪兵
 * @Date 2018/4/27
 **/
public class Rifleman implements Soldier{
    @Override
    public void executeCommand(String command) {
        System.out.println("步枪兵：" + command );
    }
}
