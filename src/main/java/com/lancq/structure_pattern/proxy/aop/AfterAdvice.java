package com.lancq.structure_pattern.proxy.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Author lancq
 * @Description 后置通知
 * @Date 2018/9/20
 **/
public class AfterAdvice implements AfterReturningAdvice {
    /**
     *
     * @param returnValue 返回值
     * @param method 被调用的方法
     * @param args 参数
     * @param target 被代理对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("-----------------后置通知---------------------");
    }
}
