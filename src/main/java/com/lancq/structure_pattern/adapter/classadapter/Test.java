package com.lancq.structure_pattern.adapter.classadapter;

/**
 * @Author lancq
 * @Description
 * @Date 2018/5/13
 **/
public class Test {
    public static void main(String[] args) {
        Target mAdapter = new Adapter();
        mAdapter.request();
    }
}
