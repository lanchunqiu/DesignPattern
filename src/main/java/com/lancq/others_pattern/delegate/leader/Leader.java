package com.lancq.others_pattern.delegate.leader;

/**
 * @Author lancq
 * @Description 委派者
 * @Date 2018/4/27
 **/
public class Leader implements ITarget {
    private EmployeeA ea = new EmployeeA();
    private EmployeeB eb = new EmployeeB();

    @Override
    public void doSomething(String command) {
        if("加密".equals(command)){
            ea.doSomething(command);
        } else if("解密".equals(command)){
            eb.doSomething(command);
        } else {
            System.out.println("老板！对不起，没人能干" + command + "工作！！");
        }
    }
}
