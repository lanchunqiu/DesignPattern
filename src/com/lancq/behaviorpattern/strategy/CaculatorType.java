package com.lancq.behaviorpattern.strategy;

/**
 * @Author lancq
 * @Description 计算类型枚举
 * @Date 2018/4/25
 **/
public enum CaculatorType {
    ADD(new AddCalculator()),
    SUBSTRACT(new SubstractCalculator()),
    MULTIPLY(new MultiplyCalculator()),
    DIVIDE(new DivideCalculator());

    private CalculatorStrategy strategy;
    CaculatorType(CalculatorStrategy strategy){
        this.strategy = strategy;
    }

    CalculatorStrategy getStrategy(){
        return this.strategy;
    }
}
