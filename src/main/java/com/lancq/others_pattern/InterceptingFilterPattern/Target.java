package com.lancq.others_pattern.InterceptingFilterPattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}
