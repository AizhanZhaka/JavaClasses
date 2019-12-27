package lesson26;

import java.util.HashSet;

public class setExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("XXX");

        set.add("AAA");
        set.add("CCC");

        set.add("WWW");

        System.out.println(set);

        for(String str: set){
            System.out.println(str);
        }
    }
}
