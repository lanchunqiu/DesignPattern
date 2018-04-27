package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description 110V电源适配器
 * @Date 2018/4/27
 **/
public class Adapter110V extends PowerPort110V implements Adapter {
    private ThinkPad pad = new ThinkPad();
    @Override
    public void powerSupply20V() {
        super.powerSupply();
        System.out.println("电源适配器将110V电压转换成笔记本电脑需要的20V电压！");
        pad.work();
    }
}
