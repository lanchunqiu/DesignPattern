package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description 美国的110v电源插口
 * @Date 2018/4/27
 **/
public class PowerPort110V {
    public PowerPort110V(){
        System.out.println("美国的110v电源插口");
    }
    
    public void powerSupply(){
        System.out.println("向外提供110v电压");
    }
}
