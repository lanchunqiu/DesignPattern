package com.lancq.structure_pattern.bridge.demo3;

/**
 * 计算机学院，RefinedAbstraction
 */
public class ComputerDpt extends Department {
    @Override
    public void select() {
        System.out.println("计算机学院的同学开始选课了：");
        mathCourse.select();
    }
}
