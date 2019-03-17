package com.lancq.structure_pattern.proxy.cglib_dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import net.sf.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class DynamicProxy2 implements MethodInterceptor {
    private Object target;

    public Object getProxyObject(Object target){
        this.target = target;

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        return methodProxy.invoke(target, args);
    }
}
