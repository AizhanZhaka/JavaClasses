package object_lesson14;

import java.util.Random;

public class TableArray {
    public static void main(String[] args) {

        Random r = new Random();

        Table tables[] = new Table[10];

        int counter = 0;
        int sumVolume = 0;
        while(counter < tables.length){

            Table t = new Table();
            t.height = r.nextInt(200);
            t.width = r.nextInt(200);
            t.length = r.nextInt(200);
            t.name = "Table #" + counter;

            int s = t.area();
            int v = t.volume();
            System.out.println("Площадь = " + s);
            System.out.println("Объем = " + v);
            t.print();
            System.out.println("--------------------------------------");

            tables[counter] = t;

            sumVolume += v;

            counter++;
        }
        System.out.println("Общий объем = " + sumVolume);

        sumVolume = 0;

//        for (int i = 0; i < tables.length; i++) {
//            Table t = tables[i];
//            t.width = 40; // tables[i].width =40
//            t.volume();
//            sumVolume += t.volume(); // sumVolume += tables[1].volume();
//        }

        for (Table t: tables){
            t.width = 40;
            sumVolume += t.volume();
        }

        System.out.println("Новый объем = " + sumVolume);
    }
}
