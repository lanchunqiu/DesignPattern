package com.lancq.behavior_pattern.visitor;

/**
 * 抽象元素类
 * @author lancq
 */
public interface Element {
    void accept(Visitor visitor);
}
