package com.lancq.structure_pattern.proxy.aop;

import com.lancq.structure_pattern.proxy.IMath;
import com.lancq.structure_pattern.proxy.Math;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class Test {
    public static void main(String[] args) {
        //实例化spring代理工厂
        ProxyFactory factory = new ProxyFactory();

        //设置被代理的对象
        factory.setTarget(new Math());

        //添加通知，横切逻辑
        factory.addAdvice(new BefaoreAdvice());
        factory.addAdvice(new AfterAdvice());
        factory.addAdvice(new SurroundAdvice());

        //从代理工厂中获得代理对象
        IMath math = (IMath) factory.getProxy();
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
    }
}
