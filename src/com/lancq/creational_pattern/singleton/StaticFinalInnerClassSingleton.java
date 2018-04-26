package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 静态内部类
 * @Date 2018/4/26
 **/
public class StaticFinalInnerClassSingleton {
    //静态内部类
    private static class SingletonHolder{
        private static final StaticFinalInnerClassSingleton INSTANCE = new StaticFinalInnerClassSingleton();
    }
    //私有构造方法
    private StaticFinalInnerClassSingleton(){}

    public static StaticFinalInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
