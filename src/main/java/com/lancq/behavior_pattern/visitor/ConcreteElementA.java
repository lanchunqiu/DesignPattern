package com.lancq.behavior_pattern.visitor;

/**
 * 具体元素A
 * @author lancq
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
