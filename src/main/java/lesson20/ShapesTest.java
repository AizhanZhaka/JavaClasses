package lesson20;

public class ShapesTest {
    public static void main(String[] args) {
        Shape circle = new Circle(8);
        Shape rect = new Rect(10, 20);
        Triangle triangle = new RightTriangle(20,5);
        Triangle tri = new BasedTriangle(20,5, 45);

        System.out.println(circle.getArea());
        System.out.println(triangle.getArea());

        System.out.println(circle.getPerimetr());
        System.out.println(rect.getPerimetr());
        System.out.println(triangle.getPerimetr());
    }
}
