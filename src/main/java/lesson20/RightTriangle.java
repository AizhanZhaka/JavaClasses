package lesson20;

public class RightTriangle extends Triangle {

    public RightTriangle(int base, int height) {
        super(base, height);
    }

    public  double getArea(){
        return  base * height/2;
    }

    public  double getPerimetr(){
        return  base + height + 10;
    }

}
