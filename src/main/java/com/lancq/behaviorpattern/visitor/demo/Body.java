package com.lancq.behaviorpattern.visitor.demo;

/**
 * （车身）具体元素类
 * @author lancq
 */
public class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
