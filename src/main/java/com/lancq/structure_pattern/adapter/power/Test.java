package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/27
 **/
public class Test {
    public static void main(String[] args) {
        System.out.println("我现在在中国");
        Adapter adapter = new Adapter220V();
        adapter.powerSupply20V();

        System.out.println("-------------华丽的分割线---------------");

        System.out.println("我出差到美国");
        adapter = new Adapter110V();
        adapter.powerSupply20V();
    }
}
