package com.lancq.creational_pattern.builder;

/**
 * 具体建造者
 */
public class ConcreteBuilder2 implements Builder {
    private Product product = new Product();
    @Override
    public void buildPartA() {
        product.addPart("Part A2");
    }

    @Override
    public void buildPartB() {
        product.addPart("Part B2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
