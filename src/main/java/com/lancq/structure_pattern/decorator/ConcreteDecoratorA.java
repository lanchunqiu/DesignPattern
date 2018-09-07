package com.lancq.structure_pattern.decorator;

/**
 * @Author lancq
 * @Description 具体装饰器类
 * @Date 2018/4/28
 **/
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation(){
        super.operation();
        addedState = "新增状态";
        System.out.println("这个类具有一个状态：" + this.addedState);
    }
}
