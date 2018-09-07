package com.lancq.behavior_pattern.observer.mouse;

import java.lang.reflect.Method;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/28
 **/
public class MouseTest {
    public static void main(String[] args) {
        //观察者和被观察者之间没有必然联系
        //注册的时候，才产生联系

        try {
            MouseEventCallback callback = new MouseEventCallback();
            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);

            System.out.println("onClick = [" + onClick + "]");
            //人为的调用鼠标的单击事件
            Mouse mouse = new Mouse();
            mouse.addListener(MouseEventType.ON_CLICK, callback, onClick);

            mouse.click();


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
