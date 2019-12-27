package lesson31_Exception;


import lesson18.TableNew;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TableException {
    public static void main(String[] args) {

//        TableNew t = new TableNew(0, 0, 0);
//
//        try{
//            t.setWidth(-45);
//        } catch (IllegalArgumentException ex){
//            t.setWidth(1);
//        }
//
//
//        try {
//            t.readSpecs();System.out.println("AAAAAA");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();System.out.println("EEEEE");
//
//        } finally {
//            System.out.println("Finally");
//        }
//
//
//        System.out.println(t.getWidth());

        try {
            FileReader in = new FileReader("a.txt");
            in.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }

    }
}
