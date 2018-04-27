package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description 220V电源适配器
 * @Date 2018/4/27
 **/
public class Adapter220V extends PowerPort220V implements Adapter {
    private ThinkPad pad = new ThinkPad();
    @Override
    public void powerSupply20V() {
        super.powerSupply();
        System.out.println("电源适配器将220V电压转换成笔记本电脑需要的20V电压！");
        pad.work();
    }
}
