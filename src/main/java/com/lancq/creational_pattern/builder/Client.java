package com.lancq.creational_pattern.builder;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Builder builder1 = new ConcreteBuilder1();
        Director director = new Director(builder1);
        Product product1 = director.construct();
        product1.show();

        Builder builder2 = new ConcreteBuilder2();
        director = new Director(builder2);
        Product product2 = director.construct();
        product2.show();
    }
}
