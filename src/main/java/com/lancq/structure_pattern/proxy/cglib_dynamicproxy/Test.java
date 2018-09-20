package com.lancq.structure_pattern.proxy.cglib_dynamicproxy;
import com.lancq.structure_pattern.proxy.Math;
/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class Test {
    public static void main(String[] args) {
        Math math = (Math) new DynamicProxy().getProxyObject(new Math());
        int a = 100;
        int b = 2;
        math.add(a,b);
        math.sub(a,b);
        math.mut(a,b);
        math.div(a,b);
    }
}
