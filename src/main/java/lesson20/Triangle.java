package lesson20;

public abstract  class Triangle extends Shape {

    protected int base;
    protected int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }


    public  int getTotalAngels(){
        return 180;
    }
}
