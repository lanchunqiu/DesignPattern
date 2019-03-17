package com.lancq.structure_pattern.proxy.jdk_dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy2 implements InvocationHandler {

    private Object target;

    public Object getProxyObject(Object target){
        this.target = target;
        Class clazz = target.getClass();
        Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
        return proxy;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return method.invoke(target, args);
    }
}
