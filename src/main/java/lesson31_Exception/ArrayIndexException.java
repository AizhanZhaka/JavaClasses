package lesson31_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Введите число");
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println(a/b);
        } catch (ArithmeticException ex){
            System.out.println("Нельзы делить на 0");
        } catch (InputMismatchException ex){
            System.out.println("Не является числом");
        }
    }
}
