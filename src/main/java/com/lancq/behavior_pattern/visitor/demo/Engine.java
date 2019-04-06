package com.lancq.behavior_pattern.visitor.demo;

/**
 * （发动机）具体元素类
 * @author lancq
 */
public class Engine implements CarElement{
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
