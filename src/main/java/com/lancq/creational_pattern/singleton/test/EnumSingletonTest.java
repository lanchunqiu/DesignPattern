package com.lancq.creational_pattern.singleton.test;

import com.lancq.creational_pattern.singleton.EnumSingleton;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class EnumSingletonTest extends Thread{
	
	public static void main(String[] args){
		EnumSingletonTest[] mts = new EnumSingletonTest[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new EnumSingletonTest();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
	
	@Override  
	public void run() {   
	    System.out.println(EnumSingleton.INSTANCE.getResource().hashCode());
	} 
}

