package lesson25_collections;

import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(20);

        list.add("Asem");
        list.add("Vasya");
        list.add("Talgat");
        list.add("Aina");
        list.add("Maks");
        list.add("Lyuda");
        list.add("Zhenya");
        list.add("Anya");
        list.add("Tima");
        list.add("Masha");

        list.sort(null);
        System.out.println(list);

        System.out.println(list.size());

        String str = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i+1) + " : " + list.get(i));
        }

        int size = list.size();
        for (int i = 0; i < size; i++) {
                list.remove(0);
        }
        System.out.println(list);

        //list.clear(); //delete all

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);

        int i = numbers.get(0);


    }
}
