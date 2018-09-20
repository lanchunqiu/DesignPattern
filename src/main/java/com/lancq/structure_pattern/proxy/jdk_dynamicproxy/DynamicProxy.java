package com.lancq.structure_pattern.proxy.jdk_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class DynamicProxy implements InvocationHandler {
    private Object targetObj;

    public Object getProxyObject(Object target){
        this.targetObj = target;
        Class clazz = target.getClass();
        Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);

        return proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        //this.lazy();
        Object result = method.invoke(targetObj,args);
        return result;
    }
}
