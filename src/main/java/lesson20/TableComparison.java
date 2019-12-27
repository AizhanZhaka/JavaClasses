package lesson20;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class TableComparison {
    public static void main(String[] args) {
        Table20 t1 = new Table20(10,20,30);
        t1.setName("Деревянный");
        Table20 t2 = new Table20(10,20,30);
        Table20 t3 = t1;

        String str = "6576";

        System.out.println(t1 = t2);
        System.out.println(t1 = t3);

        System.out.println("Table comp = " + t1.equals(t2));
        System.out.println(t1);
    }
}
