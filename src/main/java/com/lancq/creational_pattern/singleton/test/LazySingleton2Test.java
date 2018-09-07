package com.lancq.creational_pattern.singleton.test;


import com.lancq.creational_pattern.singleton.LazySingleton2;

/**
 * @Author lancq
 * @Description 验证 （懒汉，线程安全性）
 * @Date 2018/4/26
 **/
public class LazySingleton2Test extends Thread{
	
	public static void main(String[] args){
		LazySingleton2Test[] mts = new LazySingleton2Test[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new LazySingleton2Test();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
    @Override  
    public void run() {   
        System.out.println(LazySingleton2.getInstance().hashCode());
    } 
}

