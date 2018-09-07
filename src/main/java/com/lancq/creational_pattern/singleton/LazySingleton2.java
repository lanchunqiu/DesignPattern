package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 懒汉（线程安全，效率低）
 * @Date 2018/4/26
 **/
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2 = null;

    private LazySingleton2(){
    }

    public static synchronized LazySingleton2 getInstance(){
        if( lazySingleton2 == null){

            try {
                Thread.sleep(100);//方便线程测试，休眠一定时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lazySingleton2 = new LazySingleton2();
        }
        return lazySingleton2 ;
    }
}
