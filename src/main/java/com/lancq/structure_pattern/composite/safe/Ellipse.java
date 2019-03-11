package com.lancq.structure_pattern.composite.safe;

//Leaf
public class Ellipse implements Graphic {
    @Override
    public void print() {
        System.out.println("Ellipse print");
    }
}
