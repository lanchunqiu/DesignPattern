package com.lancq.structure_pattern.proxy;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class Math implements IMath {
    @Override
    public int add(int n1, int n2) {
        System.out.println(n1 + " + " + n2 + " = "  + (n1 + n2));
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int mut(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}
