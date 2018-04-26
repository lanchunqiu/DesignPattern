package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 饿汉单例模式（静态代码块）
 * @Date 2018/4/26
 **/
public class HungarySingleton2 {
    private static HungarySingleton2 singleton = null;

    static {
        singleton = new HungarySingleton2();
    }

    private HungarySingleton2(){
    }

    public static HungarySingleton2 getInstance(){
        return singleton;
    }
}
