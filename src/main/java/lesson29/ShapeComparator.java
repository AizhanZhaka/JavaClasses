package lesson29;

import lesson20.Circle;
import lesson20.Rect;
import lesson20.RightTriangle;
import lesson20.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ShapeComparator {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(25),
                new Rect(15, 20),
                new RightTriangle(12, 5)
        );
        shapes.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                if(o1.getArea() == o2.getArea()){
                return 0;
                } else if(o1.getArea() > o2.getArea()){
                return 1;
                } else{
                return -1;
                }
            }
        });
        System.out.println(shapes);

        //DZ
//        List<Object> color = Arrays.asList(
//                "orange",
//                "blue",
//                "orange"
//        );

    }
}
