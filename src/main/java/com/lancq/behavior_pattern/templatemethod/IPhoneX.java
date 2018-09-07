package com.lancq.behavior_pattern.templatemethod;

public class IPhoneX extends MobilePhone{
    public IPhoneX(String name){
        System.out.println("手机名称 [" + name + "]");
    }
    @Override
    public String installOS() {
        return "IOS系统";
    }

    @Override
    public int installBattary() {
        return 2000;
    }
}
