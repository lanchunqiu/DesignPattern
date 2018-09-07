package com.lancq.structure_pattern.decorator;

import java.io.*;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/7
 **/
public class DecoratorDemo {
    public static void main(String[] args) throws FileNotFoundException {

        //被装饰者
        InputStream inputStream = new FileInputStream("a.txt");

        //装饰者
        //DataInputStream <- FilterInputStream <- InputStream
        FilterInputStream filterInputStream = new DataInputStream(inputStream);
    }
}
