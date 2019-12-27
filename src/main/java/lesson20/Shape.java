package lesson20;

public abstract  class Shape {

    private  String name;

    public abstract double getArea();

    public  abstract  double getPerimetr();

    public  abstract int getTotalAngels();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                getArea() + '}';
    }
}
