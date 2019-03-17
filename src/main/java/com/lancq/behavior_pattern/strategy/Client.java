package com.lancq.behavior_pattern.strategy;

public class Client {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //int r = CaculatorType.ADD.getStrategy().execute(a, b);
        //System.out.println("r = [" + r + "]");

        Context context = new Context(CaculatorType.ADD.getStrategy());
        int r = context.execute(a, b);
        System.out.println("a + b = " + r);

        context.setStrategy(CaculatorType.SUBSTRACT.getStrategy());
        r = context.execute(a, b);
        System.out.println("a - b = " + r);

        context.setStrategy(CaculatorType.MULTIPLY.getStrategy());
        r = context.execute(a, b);
        System.out.println("a * b = " + r);

        context.setStrategy(CaculatorType.DIVIDE.getStrategy());
        r = context.execute(a, b);
        System.out.println("a / b = " + r);
    }
}
