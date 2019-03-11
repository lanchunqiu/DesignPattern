package com.lancq.structure_pattern.composite.safe;


import java.util.ArrayList;
import java.util.List;

//Composite
public class CompositeGraphic implements Graphic {
    //Collection of child graphics.
    private List<Graphic> childGraphic = new ArrayList<Graphic>();

    @Override
    public void print() {
        for(Graphic graphic : childGraphic){
            graphic.print();
        }
    }

    public void add(Graphic graphic){
        childGraphic.add(graphic);
    }

    public void remove(Graphic graphic){
        childGraphic.remove(graphic);
    }
}
