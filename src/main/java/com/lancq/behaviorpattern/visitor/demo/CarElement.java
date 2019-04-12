package com.lancq.behaviorpattern.visitor.demo;

/**
 * 抽象元素类
 * @author lancq
 */
public interface CarElement {
    void accept(CarElementVisitor visitor);
}
