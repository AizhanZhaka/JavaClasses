//hw1-array1 task 2b
package lesson13;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random r = new Random(2); // в скобках пишем цифру любую для того, чтобы он генерировал одну комбинацию чисел

        int ar[][] = new int [2][3];
        for (int i = 0; i < ar[0].length; i++) {
            ar[0][i] = r.nextInt(21) - 10;
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[1].length; j++) {
            System.out.print(ar[i][j] + " ");
            }
        System.out.println();
        }
        for (int i = 0; i < ar[0].length; i++) {
            ar[1][i] = ar[0][i];
        }
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[1].length; j++) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
