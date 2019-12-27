package lesson17;

public class FigureTest {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setWidth(10);
        s.setHeight(14);
        s.showDimens();

        Shape s2 = new Shape();
        s2.showDimens();

        new Shape(33).showDimens();

        s2 = new Shape(45,55);
        s2.showDimens();

//        Rectangular r = new Rectangular();
        Rectangular r = new Rectangular("My box", 25, 20);
        r.setWidth(20);
        r.setHeight(25);
        r.showDimens();
        r.name = "My box";
        r.showName();
        System.out.println("Square = " + r.isSquare());


        Rectangular r2 = new Rectangular("My square", 20, 20);
        r2.setWidth(20);
        r2.setHeight(20);
        r2.name = "My square";
        r2.showDimens();
        r2.showName();
        System.out.println("Square = " + r2.isSquare());

        System.out.println("Rectangular is square = " + new Rectangular("New Box", 99).isSquare());
        System.out.println("------------------------------------------------------------");
        new Rectangular("AAAAA", 2).showDimens();

        Shape ss = new Rectangular("obj", 58);
        ss.showDimens();
    }
}
