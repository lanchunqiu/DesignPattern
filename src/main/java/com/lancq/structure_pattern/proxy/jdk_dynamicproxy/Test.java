package com.lancq.structure_pattern.proxy.jdk_dynamicproxy;

import com.lancq.structure_pattern.proxy.IMath;
import com.lancq.structure_pattern.proxy.Math;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class Test {
    public static void main(String[] args) {
        IMath math = (IMath) new DynamicProxy().getProxyObject(new Math());
        int a = 100;
        int b = 2;
        math.add(a,b);
        math.sub(a,b);
        math.mut(a,b);
        math.div(a,b);

        //输出动态代理生成的类
        byte[] classFile = ProxyGenerator.generateProxyClass("Math$Proxy",Math.class.getInterfaces());
        String path = "Math$Proxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)){
            fos.write(classFile);
            fos.flush();
        } catch (Exception e){

        }
    }
}
