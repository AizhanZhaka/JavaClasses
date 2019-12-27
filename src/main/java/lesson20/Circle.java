package lesson20;

public class Circle extends Shape {

    private  int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimetr(){
        return  2 * Math.PI * radius;
    }

    @Override
    public int getTotalAngels() {
        return 0;
    }
}
