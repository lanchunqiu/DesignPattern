package com.lancq.structure_pattern.proxy.staticproxy;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class Test {
    public static void main(String[] args) {
        SuperStar star = new SuperStar();
        Agent agent = new Agent(star);
        agent.perform();
    }
}
