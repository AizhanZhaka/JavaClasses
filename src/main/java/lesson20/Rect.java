package lesson20;

public class Rect extends Shape {

    private int width;
    private int length;

    public Rect(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return  width * length;
    }

    public double getPerimetr(){
        return  2 * (width * length);
    }

    @Override
    public int getTotalAngels() {
        return 0;
    }
}
