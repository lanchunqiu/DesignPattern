package com.lancq.structure_pattern.flyweight;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class StringInterningDemo {
    public static void main(String[] args) {
        String value = new String("Hello");//在Heap中

        String newValue = value.intern();//放置常量池
    }
}
