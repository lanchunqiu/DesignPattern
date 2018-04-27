package com.lancq.others_pattern.delegate.leader;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/27
 **/
public class EmployeeA implements ITarget {
    @Override
    public void doSomething(String command) {
        System.out.println("EmployeeA：开始写" + command + "相关代码...");
    }
}
