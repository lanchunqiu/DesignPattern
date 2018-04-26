package com.lancq.behaviorpattern.strategy;

/**
 * @Author lancq
 * @Description 减法计算
 * @Date 2018/4/25
 **/
public class SubstractCalculator implements CalculatorStrategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
