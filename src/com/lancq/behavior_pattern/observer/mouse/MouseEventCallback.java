package com.lancq.behavior_pattern.observer.mouse;

/**
 * @Author lancq
 * @Description 观察者，回调响应的逻辑，由自己实现
 * @Date 2018/4/28
 **/
public class MouseEventCallback {
    public void onClick(Event e){
        System.out.println("这是鼠标单击以后要执行的逻辑");
        System.out.println("=======触发鼠标单击事件========\n" + e);
    }

    public void onDoubleClick(Event e){
        System.out.println("=======触发鼠标双击事件========\n" + e);
    }

}
