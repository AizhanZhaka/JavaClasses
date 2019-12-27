package lesson31_Exception;

import java.util.InputMismatchException;

public class ExceptionsExample {
    public static void main(String[] args) {
        try{
            int a = 5;
            int b = 2;

            System.out.println(a/b);
            System.out.println("Следующий код");

            int ar[] = {1, 2, 3};
            System.out.println(ar[4]);

        } catch (ArithmeticException ex){
            System.out.println("Нельзя делить на 0");
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Неверный индекс");
            ex.printStackTrace(); //показывает где именно произошла ошибка
        } catch (InputMismatchException ex){
            ex.printStackTrace();
        }

        //объединить ошибки, одна обработка
//        catch (ArithmeticException | ArrayIndexOutOfBoundsException ex){
//            System.out.println("Нельзя делить на 0");
//        }

        System.out.println("Последний код");
    }
}
