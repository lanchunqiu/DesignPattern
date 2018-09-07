package com.lancq.creational_pattern.singleton.test;


import com.lancq.creational_pattern.singleton.StaticFinalInnerClassSingleton;
/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class StaticFinalInnerClassSingletonTest extends Thread {
	
	public static void main(String[] args){
		StaticFinalInnerClassSingletonTest[] mts = new StaticFinalInnerClassSingletonTest[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new StaticFinalInnerClassSingletonTest();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
    @Override  
    public void run() {   
        System.out.println(StaticFinalInnerClassSingleton.getInstance().hashCode());
    } 

}
