package com.lancq.behaviorpattern.interpreter;

/**
 * 抽象表达式
 *
 * @author lancq
 */
public abstract class AbstractExpression {

    public abstract void interpret(Context info);
}
