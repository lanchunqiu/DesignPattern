package com.lancq.structure_pattern.proxy.dynamicproxy;

import com.lancq.structure_pattern.proxy.staticproxy.SuperStar;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author lancq
 * @Description 动态代理类
 * @Date 2018/4/26
 **/
public class DynamicProxy implements InvocationHandler {
    private SuperStar target;

    public Object getInstance(SuperStar target){
        this.target = target;
        Class clazz = target.getClass();
        Object obj = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("经进人：已经拿到电视台的演出邀请");
        System.out.println("经进人：向大明星确认是否接受演出邀请");

        Object result = method.invoke(target,args);

        System.out.println("经进人：大明星演出完毕，收到100万的演出费");

        return result;
    }
}
