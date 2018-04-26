package com.lancq.behaviorpattern.templatemethod;

public class HuaWeiHonor extends MobilePhone {
    public HuaWeiHonor(String name){
        System.out.println("手机名称 [" + name + "]");
    }
    @Override
    public String installOS() {
        return "Android系统";
    }

    @Override
    public int installBattary() {
        return 4000;
    }
}
