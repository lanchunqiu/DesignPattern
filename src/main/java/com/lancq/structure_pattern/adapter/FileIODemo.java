package com.lancq.structure_pattern.adapter;

import java.io.*;

/**
 * @Author lancq
 * @Description 适配器模式示例
 * @Date 2018/9/7
 **/
public class FileIODemo {
    public static void main(String[] args) throws Exception {
        //目前拥有的对象
        InputStream inputStream = new FileInputStream("abc.txt");

        //需要的对象
        //inputStream -> reader
        Reader reader = new InputStreamReader(inputStream,"UTF-8");

        print(reader);
    }

    private static void print(Reader reader){

    }
}
