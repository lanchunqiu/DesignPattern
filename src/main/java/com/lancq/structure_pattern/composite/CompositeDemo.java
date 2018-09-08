package com.lancq.structure_pattern.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class CompositeDemo {
    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize composite graphic
        CompositeGraphic graphic = new CompositeGraphic();

        //Composes the graphics
        graphic.add(ellipse1);
        graphic.add(ellipse2);
        graphic.add(ellipse3);

        graphic.add(ellipse4);

        //Prints the complete graphic (Four times the string "Ellipse").
        graphic.print();
    }

    //Component
    private static interface Graphic{
        public void print();
    }

    //Composite
    private static class CompositeGraphic implements Graphic{

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

    //Leaf
    private static class Ellipse implements Graphic{

        @Override
        public void print() {
            System.out.println("Ellipse print");
        }
    }


}
