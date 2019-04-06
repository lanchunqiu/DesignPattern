package com.lancq.behavior_pattern.visitor;

/**
 * 具体访问者B
 * @author lancq
 */
public class ConcreteVisitorB implements Visitor {
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("具体访问者B：" + elementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("具体访问者B：" + elementB.operationB());
    }
}
