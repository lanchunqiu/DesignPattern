package com.lancq.creational_pattern.builder;

/**
 * 抽象建造者
 */
public interface Builder {
    void buildPartA();

    void buildPartB();

    Product getResult();
}
