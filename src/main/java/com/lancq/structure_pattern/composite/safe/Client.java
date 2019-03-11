package com.lancq.structure_pattern.composite.safe;
// 安全组合模式
public class Client {
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
}
