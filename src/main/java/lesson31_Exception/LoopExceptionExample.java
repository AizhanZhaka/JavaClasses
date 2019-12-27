package lesson31_Exception;

public class LoopExceptionExample {
    public static void main(String[] args) {

        int ar1[] = {4, 7, 5, 4, 6, 2, 9};
        int ar2[] = {0, 5, 6, 3, 0};

        try {
            for (int i = 0; i < ar1.length; i++) {
                try {
                    System.out.println(ar1[i] / ar2[i]);
                } catch (ArithmeticException ex) {
                    System.out.println("Деление на 0 на " + i + " индексе");
                }
            }
        }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Неверный индекс: " + ex.getMessage());
            }
        System.out.println("Конец программы");
        }
    }


