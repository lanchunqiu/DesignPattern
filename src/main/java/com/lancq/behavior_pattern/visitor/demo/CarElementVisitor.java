package com.lancq.behavior_pattern.visitor.demo;

/**
 * 抽象访问类
 * @author lancq
 */
public interface CarElementVisitor {
    void visit(Body body);
    void visit(Car car);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
