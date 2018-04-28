package com.lancq.structure_pattern.decorator.example;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class BMWCarDecorator extends Decorator{
    private void ACC(){
        System.out.println("增加自动巡航功能！");
    }
    private void ABS(){
        System.out.println("增加ABS功能！");
    }
    @Override
    public void run(){
        super.run();
        this.ACC();
        this.ABS();
    }
}
