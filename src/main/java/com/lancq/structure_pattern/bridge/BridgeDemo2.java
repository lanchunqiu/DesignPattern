package com.lancq.structure_pattern.bridge;

/**
 * @Author lancq
 * @Description
 * @Date 2018/9/8
 **/
public class BridgeDemo2 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
          new CircleShape(1.0,2.0,3.0,new DrawingAPI1()),
          new CircleShape(5.0,7.0,11.0,new DrawingAPI2())
        };

        for(Shape shape : shapes){
            //shape.draw();
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }

    //Implementor
    private interface DrawingAPI{
        public void drawCircle(final double x, final double y, final double radius);
    }

    //ConcreteImplementor 1/2
    private static class DrawingAPI1 implements DrawingAPI{

        @Override
        public void drawCircle(double x, double y, double radius) {
            System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
        }
    }
    //ConcreteImplementor 2/2
    private static class DrawingAPI2 implements DrawingAPI{

        @Override
        public void drawCircle(double x, double y, double radius) {
            System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
        }
    }

    //Abstraction
    private static abstract class Shape{
        protected DrawingAPI drawingAPI;

        protected Shape(final DrawingAPI drawingAPI){
            this.drawingAPI = drawingAPI;
        }

        public abstract void draw();//low level
        public abstract void resizeByPercentage(final double pct);//height level
    }

    private static class CircleShape extends Shape{
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

}
