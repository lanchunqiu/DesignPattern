package com.lancq.structure_pattern.decorator;

/**
 * @Author lancq
 * @Description 具体的组件类
 * @Date 2018/4/28
 **/
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("基本操作");
    }
}
