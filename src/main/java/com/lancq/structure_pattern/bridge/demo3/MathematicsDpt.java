package com.lancq.structure_pattern.bridge.demo3;

/**
 * 数学院，RefinedAbstraction
 */
public class MathematicsDpt extends Department{
    @Override
    public void select() {
        System.out.println("数学院的同学开始选课了：");
        mathCourse.select();
    }
}
