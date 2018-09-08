package com.lancq.structure_pattern.facade;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class FacadeDemo {
    public static void main(String[] args) {
        ServiceFacade serviceFacade = new ServiceFacade();
        serviceFacade.service();
    }

    private static class ServiceA{
        public void save(){
            System.out.println("save");
        }
    }

    private static class ServiceB{
        public void delete(){
            System.out.println("delete");
        }
    }

    private static class ServiceFacade{
        private ServiceA serviceA;
        private ServiceB serviceB;

        public ServiceFacade(){
            serviceA = new ServiceA();
            serviceB = new ServiceB();
        }

        public void service(){
            serviceB.delete();
            serviceA.save();
        }
    }
}
