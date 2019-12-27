package lesson19;

import lesson17.Shape;

public class Triangle extends Shape {

    @Override
    public double getArea() {                              //метод overriding
//        System.out.println("Triangle.getArea()");
//        return getHeight() * getWidth() / 2;
        return super.getArea();
    }

    public Triangle(int width, int height) {
        super(width, height);
    }

}