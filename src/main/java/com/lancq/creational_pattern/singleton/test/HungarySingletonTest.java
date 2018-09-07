package com.lancq.creational_pattern.singleton.test;

import com.lancq.creational_pattern.singleton.HungarySingleton;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class HungarySingletonTest extends Thread {
	
	public static void main(String[] args){
		HungarySingletonTest[] mts = new HungarySingletonTest[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new HungarySingletonTest();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
    @Override  
    public void run() {   
        System.out.println(HungarySingleton.getInstance().hashCode());
    } 

}
