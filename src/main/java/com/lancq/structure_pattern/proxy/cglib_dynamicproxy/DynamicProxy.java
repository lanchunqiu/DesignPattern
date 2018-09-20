package com.lancq.structure_pattern.proxy.cglib_dynamicproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Random;

/**
 * @Author lancq
 * @Description CGLIB,动态代理类
 *              实现一个方法拦截器接口
 * @Date 2018/9/20
 **/
public class DynamicProxy implements MethodInterceptor {
    //被代理对象
    private Object targetObj;

    //动态生成一个新类
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
        //Object result = methodProxy.invokeSuper(object, args);
        Object result = methodProxy.invoke(this.targetObj, args);//和上一行代码等价
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
