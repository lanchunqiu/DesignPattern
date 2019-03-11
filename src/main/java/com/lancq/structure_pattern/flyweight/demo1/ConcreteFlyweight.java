package com.lancq.structure_pattern.flyweight.demo1;
// 共享的具体享元对象
public class ConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("共享的具体享元对象：" + extrinsicState);
    }
}
