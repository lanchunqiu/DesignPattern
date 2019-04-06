package com.lancq.behavior_pattern.visitor.demo;

/**
 * （车轮）具体元素类
 * @author lancq
 */
public class Wheel implements CarElement{
    private final String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {

        /*
         * accept(CarElementVisitor) in Wheel implements
         * accept(CarElementVisitor) in CarElement, so the call
         * to accept is bound at run time. This can be considered
         * the *first* dispatch. However, the decision to call
         * visit(Wheel) (as opposed to visit(Engine) etc.) can be
         * made during compile time since 'this' is known at compile
         * time to be a Wheel. Moreover, each implementation of
         * CarElementVisitor implements the visit(Wheel), which is
         * another decision that is made at run time. This can be
         * considered the *second* dispatch.
         */
        visitor.visit(this);
    }
}
