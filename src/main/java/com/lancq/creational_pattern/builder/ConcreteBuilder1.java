package com.lancq.creational_pattern.builder;

/**
 * 具体建造者
 */
public class ConcreteBuilder1 implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("Part A1");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part B1");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
