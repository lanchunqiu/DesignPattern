package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 饿汉单例模式
 * @Date 2018/4/26
 **/
public class HungarySingleton {
    private static HungarySingleton singleton = new HungarySingleton();
    private HungarySingleton(){
    }
    public static HungarySingleton getInstance(){
        return singleton;
    }
}
