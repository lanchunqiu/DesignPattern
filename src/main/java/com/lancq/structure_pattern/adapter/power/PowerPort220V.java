package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description 中国的220v电源插口
 * @Date 2018/4/27
 **/
public class PowerPort220V {
    public PowerPort220V(){
        System.out.println("中国的220v电源插口");
    }

    public void powerSupply(){
        System.out.println("向外提供220v电压");
    }
}
