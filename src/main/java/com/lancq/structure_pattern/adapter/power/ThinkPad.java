package com.lancq.structure_pattern.adapter.power;

/**
 * @Author lancq
 * @Description 笔记本电脑类（工作需要20V电压）
 * @Date 2018/4/27
 **/
public class ThinkPad {
    public ThinkPad(){
        System.out.println("笔记本电脑需要20v电压");
    }

    public void work(){
        System.out.println("笔记本电脑开始工作了");
    }
}
