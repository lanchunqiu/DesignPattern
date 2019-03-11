package com.lancq.structure_pattern.bridge.demo3;

/**
 * 高等数学类，ConcreteImplementor
 */
public class AdvanceMath extends Math {
    @Override
    public void select() {
        System.out.println("选择了高等数学");
    }
}
