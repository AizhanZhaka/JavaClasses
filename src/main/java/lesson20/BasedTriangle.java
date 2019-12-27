package lesson20;

public class BasedTriangle extends  Triangle {

    private int sideC;

    public  BasedTriangle(int a, int b, int c){
        super(a, b);
        sideC = c;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimetr() {
        return base + height + sideC;
    }


}
