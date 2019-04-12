package com.lancq.behaviorpattern.strategy;

/**
 * @Author lancq
 * @Description 计算策略类
 * @Date 2018/4/25
 **/
public interface CalculatorStrategy {
    /**
     * 计算接口
     * @param a
     * @param b
     * @return
     */
    public int execute(int a, int b);
}
