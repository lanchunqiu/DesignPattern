package com.lancq.structure_pattern.bridge.demo2;

//Refined Abstraction
public class CircleShape extends Shape{
    private double x, y, radius;

    public CircleShape(final double x, final double y, final double radius, final DrawingAPI drawingAPI){
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // low-level Implementation specific
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }

    // high-level Abstraction specific
    @Override
    public void resizeByPercentage(double pct) {
        radius *= (1.0 + pct/100.0);
    }
}
