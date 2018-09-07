package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 懒汉单例模式（线程不安全）
 * @Date 2018/4/26
 **/
public class LazySingleton {
    //私有静态变量
    private static LazySingleton singleton = null;

    //私有构造方法
    private LazySingleton(){}

    //获取实例
    public static LazySingleton getInstance(){
        if(singleton == null){
            try {
                Thread.sleep(100);//方便线程测试，休眠一定时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            singleton = new LazySingleton();
        }
        return singleton;
    }

}
