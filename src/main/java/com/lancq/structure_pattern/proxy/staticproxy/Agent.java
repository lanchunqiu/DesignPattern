package com.lancq.structure_pattern.proxy.staticproxy;

import com.lancq.structure_pattern.proxy.Performer;

/**
 * @Author lancq
 * @Description 经纪人
 * @Date 2018/4/26
 **/
public class Agent implements Performer {
    private SuperStar star;
    public Agent(SuperStar star){
        this.star = star;
    }
    @Override
    public void perform() {
        System.out.println("经济人接收到演出邀请");
        System.out.println("经济人向明星确认是否接受邀请");
        star.perform();
    }
}
