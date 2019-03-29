package com.lancq.behavior_pattern.mediator.demo;

/**
 * 客服MM
 * @author lancq
 */
public class CustomerServiceMM extends CustomerServer{
    /**
     * 顾客
     */
    private Customer customer;

    /**
     * 技术人员
     */
    private Technician technician;



    @Override
    public void communicate(String msg, Communicator communicator) {
        if (communicator == customer) {
            technician.getMessage(msg);
        } else {
            customer.getMessage(msg);
        }
    }

    /**
     * 设置客户
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * 设置技术人员
     * @param technician
     */
    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
