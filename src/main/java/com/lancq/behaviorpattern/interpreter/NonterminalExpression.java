package com.lancq.behaviorpattern.interpreter;

/**
 * 非终端表达式
 *
 * @author lancq
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context info) {
        System.out.println(info.getInputString());
        System.out.println("非终端解释器");
    }
}
