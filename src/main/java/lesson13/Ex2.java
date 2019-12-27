//hw1-array1 task 4
package lesson13;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        double goods[] = new double[]{
                2.98, 4.5, 9.98, 4.49, 6.87
        };

        Scanner in = new Scanner(System.in);

        int totalGoodsAmount = 0;
        double TotalSum = 0;

        boolean running = true;
        while(running){
            int goodNumber = in.nextInt();
            if(goodNumber == 0){
                running = false;
            } else{
                int amount = in.nextInt();
                totalGoodsAmount += amount;
                TotalSum += goods[goodNumber -1] * amount;
            }
        }
        System.out.println("Общая сумма продаж = " + TotalSum);
        System.out.println("Общее количество продаж = " + totalGoodsAmount);
    }
}
