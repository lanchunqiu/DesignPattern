package com.lancq.creational_pattern.builder;

/**
 * 指挥者
 */
public class Director {
    private Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        return builder.getResult();
    }
}
