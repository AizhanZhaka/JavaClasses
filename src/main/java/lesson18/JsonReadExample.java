package lesson18;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonReadExample {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        FileReader r = new FileReader("out.txt");
        TableNew t = gson.fromJson(r, TableNew.class);
        t.print();
        System.out.println(t.getManufactureDate());



        for(String color : t.getColors()){
            System.out.println(color);
        }

        System.out.println(t.getMaterial().getBoardMaterial());
    }
}
