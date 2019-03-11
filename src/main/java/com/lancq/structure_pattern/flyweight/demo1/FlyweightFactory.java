package com.lancq.structure_pattern.flyweight.demo1;

import java.util.HashMap;
import java.util.Map;

// 享元工场类
public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory() {
        flyweights.put("A", new ConcreteFlyweight());
        flyweights.put("B", new ConcreteFlyweight());
        flyweights.put("C", new ConcreteFlyweight());
        flyweights.put("D", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
