package com.lancq.structure_pattern.facade;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class FacadeDemo2 {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operation1();
        facade.operation2();
    }

    private static class SubSystemA{
        public String operationA1(){
            return "Subsystem A, Method A1\n";
        }
        public String operationA2()
        {
            return "Subsystem A, Method A2\n";
        }
    }
    private static class SubSystemB{
        public String operationB1(){
            return "Subsystem B, Method B1\n";
        }
        public String operationB2()
        {
            return "Subsystem B, Method B2\n";
        }
    }
    private static class SubSystemC{
        public String operationC1(){
            return "Subsystem C, Method C1\n";
        }
        public String operationC2()
        {
            return "Subsystem C, Method C2\n";
        }
    }

    private static class Facade{
        private SubSystemA a = new SubSystemA();
        private SubSystemB b = new SubSystemB();
        private SubSystemC c = new SubSystemC();

        public void operation1(){
            System.out.println("operation 1\n" +
                    a.operationA1() +
                    b.operationB1() +
                    c.operationC1()
            );
        }

        public void operation2(){
            System.out.println("operation 2\n" +
                    a.operationA2() +
                    b.operationB2() +
                    c.operationC2()
            );
        }
    }
}
