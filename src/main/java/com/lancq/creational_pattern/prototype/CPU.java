package com.lancq.creational_pattern.prototype;

import java.io.Serializable;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class CPU implements Serializable {
    private long cpu_no;//cpu序列号，每个CPU序列号均不相同
    public long getCpu_no() {
        return cpu_no;
    }

    public void setCpu_no(long cpu_no) {
        this.cpu_no = cpu_no + System.nanoTime();
    }

    public String toString(){
        return "cpu_no: " + cpu_no + ", hashCode:" + this.hashCode();
    }
}
