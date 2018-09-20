package com.lancq.structure_pattern.proxy.cglib_dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/20
 **/
public class DynamicProxy implements MethodInterceptor {
    private Object targetObj;

    public Object getProxyObject(Object object){
        this.targetObj = object;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.targetObj.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        long start = System.currentTimeMillis();
        this.lazy();
        Object result = methodProxy.invoke(targetObj,args);
        long end = System.currentTimeMillis();
        System.out.println("共用时：" + (end - start));
        return result;
    }

    private void lazy(){
        int n = new Random().nextInt(500);
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
