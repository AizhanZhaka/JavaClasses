package lesson29;

import com.sun.javafx.logging.JFRInputEvent;

import java.util.*;

import static java.util.Collections.swap;

public class CollectionsExample {
    public static void main(String[] args) {
        int ar[] = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(ar));

        Arrays.fill(ar, 5);
        Arrays.binarySearch(ar, 5);

        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 10);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

            Random r = new Random();
        for (int i = 0; i < list.size(); i++) {
            int a = r.nextInt(list.size());
            int b = r.nextInt(list.size());
            swap(list, a, b);

        }
            System.out.println(list);

        list.sort(null);
        System.out.println(list);










    }
}
