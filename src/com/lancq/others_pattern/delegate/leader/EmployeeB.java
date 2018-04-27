package com.lancq.others_pattern.delegate.leader;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/27
 **/
public class EmployeeB implements ITarget {
    @Override
    public void doSomething(String command) {
        System.out.println("EmployeeB：开始写" + command + "相关代码...");
    }
}
