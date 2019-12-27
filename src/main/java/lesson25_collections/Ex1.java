package lesson25_collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(r.nextInt(100));
        }
            System.out.println(list);

        int counter = 0;
        System.out.println("Введите число:");
        int a = input.nextInt();

        ArrayList<Integer> index = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            if (list.get(i) == a){
                counter++;
                index.add(i);
            }
        }
        System.out.println("Встретилось " + counter + " раза");
        System.out.println("Их индексы равны " + index);

        for (int i = (index.size()-1); i >= 0; i--) {
            int b = index.get(i);
            list.remove(b);
        }
        System.out.println(list.size());
        System.out.println(list);


    }
}
