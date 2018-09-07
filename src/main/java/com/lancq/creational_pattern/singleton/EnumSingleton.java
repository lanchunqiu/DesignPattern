package com.lancq.creational_pattern.singleton;

/**
 * @Author lancq
 * @Description 枚举型单例
 * @Date 2018/4/26
 **/
public enum EnumSingleton {
    INSTANCE;

    private Resource resource = null;
    private EnumSingleton(){
        resource = new Resource();
    }
    public Resource getResource(){
        return resource;
    }
}
