package com.lancq.behavior_pattern.templatemethod;

public class Test {
    public static void main(String[] args) {
        System.out.println("富士康工厂开始生产手机了：");
        MobilePhone phone = new IPhoneX("IPhoneX");
        phone.installOS();
        phone.installBattary();
        phone.run();
        System.out.println("---------------------");
        phone = new HuaWeiHonor("Honor10");
        phone.installOS();
        phone.installBattary();
        phone.run();
    }
}
