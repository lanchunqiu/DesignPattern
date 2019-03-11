package com.lancq.creational_pattern.prototype;

import java.io.*;

/**
 * @Author lancq
 * @Description 原型类
 * @Date 2018/4/26
 **/
public class RobotPrototype implements Cloneable,Serializable{
    private long rid;//机器人序列号，每个机器人序列号均不相同
    private CPU cpu;//使用的CPU，每个机器人的CPU均不相同
    private String birthday;//生产日期
    private String factory;//生产工厂

    public RobotPrototype(long rid, String birthday, String factory){
        this.rid = rid;
        this.birthday = birthday;
        this.factory = factory;
        cpu = new CPU();
    }
    public long getRid() {
        return rid;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public void setCpu(long cpu_no) {
        this.cpu.setCpu_no(cpu_no);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    /**
     * 浅拷贝
     * @return
     */
    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 深拷贝
     * @return
     */
    protected Object deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            RobotPrototype robot = (RobotPrototype) ois.readObject();
            robot.setCpu(System.currentTimeMillis());
            robot.setRid(System.currentTimeMillis() + robot.cpu.hashCode());
            return robot;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String toString(){
        return "机器人序列号：" + this.rid + "\n\t" +
                "生产日期：" + this.birthday  + "\n\t" +
                "生产工程：" + this.factory + "\n\t" +
                "使用的CPU信息：" + this.cpu.toString() + "\n\t";
    }
}
