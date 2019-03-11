package com.lancq.structure_pattern.bridge.demo2;

public class Client {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new CircleShape(1.0,2.0,3.0, new DrawingAPI1()),
                new CircleShape(5.0,7.0,11.0, new DrawingAPI2())
        };

        for(Shape shape : shapes){
            //shape.draw();
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
