package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 军队排长，分配命令
 * @Date 2018/4/27
 **/
public class PlatoonLeader implements Soldier{
    private Sniper sniper = new Sniper();
    private Rifleman rifleman = new Rifleman();
    private Engineer engineer = new Engineer();
    private MedicalSoldier medicalSoldier = new MedicalSoldier();
    @Override
    public void executeCommand(String command) {
        if("救助伤员".equals(command)){
            medicalSoldier.executeCommand(command);
        } else if ("修理坦克".equals(command)){
            engineer.executeCommand(command);
        } else if ("狙杀敌方狙击手".equals(command)){
            sniper.executeCommand(command);
        } else if ("突出重围".equals(command)){
            rifleman.executeCommand(command);
        }
    }
}
