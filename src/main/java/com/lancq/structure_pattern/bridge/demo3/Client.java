package com.lancq.structure_pattern.bridge.demo3;

public class Client {
    public static void main(String[] args) {
        Department dp = new ComputerDpt();
        dp.setCourse(new AdvanceMath());
        dp.select();

        dp = new MathematicsDpt();
        dp.setCourse(new MathAnalysis());
        dp.select();
    }
}
