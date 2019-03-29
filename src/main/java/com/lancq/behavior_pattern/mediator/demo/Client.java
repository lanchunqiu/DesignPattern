package com.lancq.behavior_pattern.mediator.demo;

/**
 * 客户端
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        //客服妹妹
        CustomerServiceMM  mm = new CustomerServiceMM();

        //交流者
        Customer customer = new Customer(mm);
        Technician technician = new Technician(mm);

        mm.setCustomer(customer);
        mm.setTechnician(technician);

        //交流过程
        customer.ask("我买的笔记本电脑为什么开不了机？");
        technician.answer("新笔记本电脑没有电，第一次使用需要插上电源！");

    }
}
