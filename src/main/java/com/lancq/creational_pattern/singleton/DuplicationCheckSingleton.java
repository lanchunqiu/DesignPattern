package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 双重校验锁(DCL)
 * @Date 2018/4/26
 **/
public class DuplicationCheckSingleton {
    //volatile屏蔽指令重排的语义在JDK1.5中才被修复
    //在此前的JDK中即使变量被声明为volatile也不能完全避免指令重排所导致的问题，这也是在JDK1.5之前的Java中无法安全的使用DCL来实现单例的原因！！
    private static volatile DuplicationCheckSingleton singleton = null;

    private DuplicationCheckSingleton(){}

    public static DuplicationCheckSingleton getInstance(){
        if(singleton == null){//1

            //线程测试，休眠一定时间
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (DuplicationCheckSingleton.class){
                if(singleton == null){//2
                    singleton = new DuplicationCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
