package com.lancq.behaviorpattern.visitor.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类
 * @author lancq
 */
public class Car implements CarElement{
    private final List<CarElement> elements;

    public Car() {
        List<CarElement> list = new ArrayList();
        list.add(new Wheel("front left"));
        list.add(new Wheel("front right"));
        list.add(new Wheel("back left"));
        list.add(new Wheel("back right"));
        list.add(new Body());
        list.add(new Engine());
        this.elements = list;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements){
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
