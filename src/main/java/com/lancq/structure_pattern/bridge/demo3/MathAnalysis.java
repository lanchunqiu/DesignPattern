package com.lancq.structure_pattern.bridge.demo3;

/**
 * 数学分析类，ConcreteImplementor
 */
public class MathAnalysis extends Math {
    @Override
    public void select() {
        System.out.println("选择了数学分析");
    }
}
