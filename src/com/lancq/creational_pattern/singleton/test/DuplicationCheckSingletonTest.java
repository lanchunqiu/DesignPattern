package com.lancq.creational_pattern.singleton.test;

import com.lancq.creational_pattern.singleton.DuplicationCheckSingleton;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class DuplicationCheckSingletonTest extends Thread {

    public static void main(String[] args){
        DuplicationCheckSingletonTest[] mts = new DuplicationCheckSingletonTest[100];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new DuplicationCheckSingletonTest();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
    @Override
    public void run() {
        System.out.println(DuplicationCheckSingleton.getInstance().hashCode());
    }
}
