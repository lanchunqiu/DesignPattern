package com.lancq.structure_pattern.decorator;

/**
 * @Author lancq
 * @Description 具体装饰器
 * @Date 2018/4/28
 **/
public class ConcreteDecoratorB extends Decorator{
    private void addedBehavior(){
        System.out.println("现在这个对象有一个新方法！");
    }

    @Override
    public void operation(){
        super.operation();
        this.addedBehavior();
    }
}
