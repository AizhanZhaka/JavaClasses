package lesson15;

public class ParseExample {
    public static void main(String[] args) {
        String str = "45";
        int number = Integer.parseInt(str);  //превратили стринг в число
        System.out.println(number + 5);
        System.out.println(str + 5);

        String time = "20:44:40";

       // time.split(":");                           //regex - по какому символу разделить, делит и возвращает в виде массива
        String parts [] = time.split(":");

        //распечатка массива
        for (int i = 0; i < parts.length; i++) {
            System.out.println(parts[i]);
            int part = Integer.parseInt(parts[i]);
            System.out.println(part);
        }

        //variant2
        for (String p:parts){
            System.out.println(Integer.parseInt(p));
        }

    }
}
