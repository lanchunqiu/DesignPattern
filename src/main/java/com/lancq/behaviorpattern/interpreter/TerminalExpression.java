package com.lancq.behaviorpattern.interpreter;

/**
 * 终端表达式
 *
 * @author lancq
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context info) {
        System.out.println(info.getInputString());
        System.out.println("终端解释器");
    }
}
