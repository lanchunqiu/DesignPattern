package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 医疗兵
 * @Date 2018/4/27
 **/
public class MedicalSoldier implements Soldier{
    @Override
    public void executeCommand(String command) {
        System.out.println("医疗兵：" + command );
    }
}
