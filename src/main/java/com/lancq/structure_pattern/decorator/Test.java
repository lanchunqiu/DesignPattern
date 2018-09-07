package com.lancq.structure_pattern.decorator;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class Test {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();

        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(concreteComponent);
        System.out.println("经过装饰器A装饰后的操作：");
        decoratorA.operation();

        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(concreteComponent);
        System.out.println("经过装饰器B装饰后的操作：");
        decoratorB.operation();
    }
}
