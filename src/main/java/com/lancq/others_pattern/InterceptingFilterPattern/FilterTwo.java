package com.lancq.others_pattern.InterceptingFilterPattern;

/**
 * 过滤器
 */
public class FilterTwo implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("FilterTwo: " + request);
    }
}
