package lesson28;

import java.util.HashMap;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            String word = in.next();
                Integer value = map.get(word);
            if (map.containsKey(word)) {
                map.put(word, value + 1);
            } else{
            map.put(word, 1);
            }
        }
        System.out.println(map);

    }
}
