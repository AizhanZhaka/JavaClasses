package lesson32_exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryWithResourceExapmle {
    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter("a.txt")){

            out.println("Hello World");
        //throw  new ArithmeticException();
           // out.close();
        } catch  (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
