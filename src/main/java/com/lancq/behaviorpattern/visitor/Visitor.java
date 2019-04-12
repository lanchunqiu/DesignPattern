package com.lancq.behaviorpattern.visitor;

/**
 * 抽象访问者类
 * @author lancq
 */
public interface Visitor {
    void visit(ConcreteElementA elementA);
    void visit(ConcreteElementB elementB);

}
