package com.lancq.structure_pattern.proxy.dynamicproxy;

import com.lancq.structure_pattern.proxy.Performer;
import com.lancq.structure_pattern.proxy.staticproxy.SuperStar;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class Test {
    public static void main(String[] args) {
        SuperStar star = new SuperStar();
        DynamicProxy agentProxy = new DynamicProxy();
        Performer performer = (Performer) agentProxy.getInstance(star);
        performer.perform();
    }
}
