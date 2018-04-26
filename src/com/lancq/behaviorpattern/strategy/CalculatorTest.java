package com.lancq.behaviorpattern.strategy;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int r = CaculatorType.ADD.getStrategy().execute(a, b);
        System.out.println("r = [" + r + "]");
    }
}
