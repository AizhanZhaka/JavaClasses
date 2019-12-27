package object_lesson14;

public class TableTest {

    public static void main(String[] args) {
        Table t;
        t = new Table();

        t. height = 60;
        t.length = 180;
        t.width = 80;

        t.name = "black";

        t.print();
        int s = t.area();
        int v = t.volume();
        System.out.println("Площадь = " + s);
        System.out.println("Объем = " + v);

//        Table t2= t;
//        t2.width = 200;
//        System.out.println("------------------------------------------------------");
//        System.out.println("Размеры  стола: " + t.height + " x " + t.width + " x " + t.length);
//        System.out.println("Размеры 2 стола: " + t2.height + " x " + t2.width + " x " + t2.length);
//
        Table t3= new Table();
        t3. height = 100;
        t3.length = 100;
        t3.width = 200;

        t3.name = "white";
        t3.print();

        t3 = t;
        t.length = 100;

        int s3 = t3.area();
        int v3 = t3.volume();
        System.out.println("Площадь = " + s3);
        System.out.println("Объем = " + v3);

//        System.out.println("------------------------------------------------------");
//        System.out.println("Размеры  стола: " + t.height + " x " + t.width + " x " + t.length);
//        System.out.println("Размеры 3 стола: " + t3.height + " x " + t3.width + " x " + t3.length);



    }
}
