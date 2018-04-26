package com.lancq.creational_pattern.singleton.test;

import com.lancq.creational_pattern.singleton.HungarySingleton2;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class HungarySingleton2Test extends Thread {
	
	public static void main(String[] args){
		HungarySingleton2Test[] mts = new HungarySingleton2Test[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new HungarySingleton2Test();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
    @Override  
    public void run() {   
        System.out.println(HungarySingleton2.getInstance().hashCode());
    } 

}
