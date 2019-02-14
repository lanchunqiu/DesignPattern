package com.lancq.others_pattern.InterceptingFilterPattern;

/**
 * 过滤器
 */
public class FilterOne implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("FilterOne: " + request);
    }
}
