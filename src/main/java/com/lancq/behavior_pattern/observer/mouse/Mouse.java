package com.lancq.behavior_pattern.observer.mouse;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class Mouse extends EventListener{
    public void click(){
        System.out.println("鼠标单击");
        this.trigger(MouseEventType.ON_CLICK);
    }


    public void doubleClick(){
        System.out.println("鼠标双击");
        this.trigger(MouseEventType.ON_DOUBLE_CLICK);
    }

}
