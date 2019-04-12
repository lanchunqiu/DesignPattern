package com.lancq.behaviorpattern.templatemethod;

/**
 * 抽象模版类
 */
public abstract class MobilePhone {

    /**
     * 不同的手机厂商安装不同的操作系统
     * @return 操作系统名称
     */
    public abstract String installOS();

    /**
     * 安装电池
     * @return 电池容量
     */
    public abstract int installBattary();

    private void powerOn(){
        System.out.println("开机...");
        System.out.println("成功开机");
    }

    private void calling(){
        System.out.println("手机开始通话");
    }
    private void lowPowerChecking(){
        System.out.println("手机电量过低！");
    }

    private void powerOff(){
        System.out.println("手机开机");
    }

    /**
     * 模版方法
     */
    public final void run(){
        String osName = this.installOS();
        System.out.println("手机安装了" + osName + "操作系统");
        int capacity = this.installBattary();
        System.out.println("手机安装了" + capacity + "毫安电池");
        this.powerOn();
        this.calling();
        this.lowPowerChecking();
        this.powerOff();
    }
}
