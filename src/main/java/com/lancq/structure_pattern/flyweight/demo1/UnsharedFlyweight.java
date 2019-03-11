package com.lancq.structure_pattern.flyweight.demo1;
// 不被共享的享元对象
public class UnsharedFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicState) {
        System.out.println("不被共享的享元对象：" + extrinsicState);
    }
}
