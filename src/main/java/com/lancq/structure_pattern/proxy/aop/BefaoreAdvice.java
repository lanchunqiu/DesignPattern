package com.lancq.structure_pattern.proxy.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author lancq
 * @Description 前置通知
 * @Date 2018/9/20
 **/
public class BefaoreAdvice implements MethodBeforeAdvice {
    /**
     *
     * @param method 被调用的方法
     * @param args 参数
     * @param target 被代理的目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("-----------------前置通知---------------------");
    }
}
