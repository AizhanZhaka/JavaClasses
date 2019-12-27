package lesson17;

public  class Shape {

    private int width;
    private int height;

    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Shape() {
        width = 0;
        height = 0;
    }

    Shape(int a){
        width = a;
        height = a;
    }

    void showDimens(){
        System.out.println("width = " + width + "; height = " +height);

        //super class - родительский класс
        //subclass -
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        System.out.println("Shape.getArea()");
        return width = height;
    }
}

