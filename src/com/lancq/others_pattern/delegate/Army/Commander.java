package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 军队司令官，发布命令
 * @Date 2018/4/27
 **/
public class Commander {
    public static void main(String[] args){
        System.out.println("司令官开始指挥作战：");
        PlatoonLeader platoonLeader = new PlatoonLeader();
        platoonLeader.executeCommand("救助伤员");
        platoonLeader.executeCommand("修理坦克");
        platoonLeader.executeCommand("狙杀敌方狙击手");
        platoonLeader.executeCommand("突出重围");

    }
}
