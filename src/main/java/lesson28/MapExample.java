package lesson28;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.HashMap;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();



            map.put("one", 1);  // - ключ
            map.put("two", 2);
            map.put("zero", 0);
        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.get("one"));
        System.out.println(map.get("four"));

        System.out.println(map.containsKey("four"));
        System.out.println(map.containsValue(2));

        Set<String> keys = map.keySet();
        for(String k:keys){
            Integer value = map.get(k);
            System.out.println(k + "-" + value);
        }
    }
}

