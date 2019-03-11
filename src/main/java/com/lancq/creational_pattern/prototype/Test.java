package com.lancq.creational_pattern.prototype;

/**
 * @Author lancq
 * @Description
 * @Date 2018/4/26
 **/
public class Test {
    public static void main(String[] args) {
        RobotPrototype protype_robot = new RobotPrototype(System.currentTimeMillis(),"2018-4-26", "富士康机器人生产工厂");
        protype_robot.setCpu(System.currentTimeMillis());
        System.out.println("原型机 [" + protype_robot.toString() + "]");
        for(int i=0; i<10; i++){
            RobotPrototype robot = (RobotPrototype) protype_robot.deepClone();
            System.out.println("robot" + i + " [" + robot.toString() + "]");
        }
    }
}
