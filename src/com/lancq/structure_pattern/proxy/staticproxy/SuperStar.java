package com.lancq.structure_pattern.proxy.staticproxy;

import com.lancq.structure_pattern.proxy.Performer;

/**
 * @Author lancq
 * @Description 大明星
 * @Date 2018/4/26
 **/
public class SuperStar implements Performer {
    @Override
    public void perform() {
        System.out.println("大明星表演");
    }
}
