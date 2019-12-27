package lesson29;

import lesson18.TableNew;
import object_lesson14.Table;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        List<TableNew> tables = Arrays.asList(
                new TableNew(10,20,30),
                new TableNew(10,40,40),
                new TableNew(70,50,60),
                new TableNew(10,70,90),
                new TableNew(30,20,30)
        );

        System.out.println(tables);

        TableComparator myComp = new TableComparator();
        tables.sort(myComp);
        System.out.println(tables);

//        Collections.shuffle(tables);
//        System.out.println(tables);

        tables.sort(new Comparator<TableNew>() {
            @Override
            public int compare(TableNew o1, TableNew o2) {
                if(o1.volume() == o2.volume()){
                    return 0;
                } else if(o1.volume() < o2.volume()){
                    return  -1;
                }else{
                    return  1;
                }
            }
        });
        System.out.println(tables);

    }
}
