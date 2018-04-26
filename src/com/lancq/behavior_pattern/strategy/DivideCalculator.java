package com.lancq.behavior_pattern.strategy;

/**
 * @Author lancq
 * @Description 除法计算
 * @Date 2018/4/25
 **/
public class DivideCalculator implements CalculatorStrategy{
    @Override
    public int execute(int a, int b) {
        return a / b;
    }
}
