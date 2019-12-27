package lesson28;

import java.util.HashMap;
import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        HashMap<String, String> alp= new HashMap<>();
        Scanner in = new Scanner(System.in);

        alp.put("а", "a");
        alp.put("б", "b");
        alp.put("в", "v");
        alp.put("г", "g");
        alp.put("д", "d");
        alp.put("е", "e");
        alp.put("ж", "zh");
        alp.put("з", "z");
        alp.put("и", "i");
        alp.put("й", "i");
        alp.put("к", "k");
        alp.put("л", "l");
        alp.put("м", "m");
        alp.put("н", "n");
        alp.put("о", "o");
        alp.put("п", "p");
        alp.put("р", "r");
        alp.put("с", "s");
        alp.put("т", "t");
        alp.put("у", "u");
        alp.put("ф", "f");
        alp.put("ц", "c");
        alp.put("ч", "ch");
        alp.put("ш", "sh");
        alp.put("щ", "sh");
        alp.put("ь", "'");
        alp.put("ъ", "'");
        alp.put("э", "eh");
        alp.put("ю", "yu");
        alp.put("я", "ya");

        String word = in.next();


        for (int i = 0; i < word.length(); i++) {
            System.out.print(alp.get(word.charAt(i) + ""));
        }
    }
}
