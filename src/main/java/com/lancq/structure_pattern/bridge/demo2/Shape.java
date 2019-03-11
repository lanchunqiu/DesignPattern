package com.lancq.structure_pattern.bridge.demo2;

//Abstraction
public abstract class Shape {
    protected DrawingAPI drawingAPI;

    protected Shape(final DrawingAPI drawingAPI){
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();//low level
    public abstract void resizeByPercentage(final double pct);//height level
}
