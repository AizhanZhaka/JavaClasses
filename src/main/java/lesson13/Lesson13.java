package lesson13;

import java.util.Random;

public class Lesson13 {
    public static void main(String[] args) {
        int ar[] = new int [5];
        int ar2 [][] = new int[3][5];

        Random r = new Random();

//        int i = 0;
//        while(i < 3){
//            int j = 0;
//            while(j < 5){
//                ar2[i][j] = r.nextInt(10);
//                j++;
//            }
//            i++;
//        }
//            int x = 0, y = 0;
//            while(x < 3){
//                y = 0;
//                while(y < 5){
//                    System.out.print(ar2[x][y] + " ");
//                    y++;
//                }
//                System.out.println();
//                x++;
//            }



//        for (int x = 0; x < 3 ; x++) {
//            for (int y = 0; y < 5; y++) {
//                System.out.print(ar2[x][y]+ " ");
//            }
//            System.out.println();
//        }


        for (int a = 0; a < 3; a++) {
        int c = 1;
            for (int b = 0; b < 5; b++) {
                ar2[a][b] = c;
                c++;
            }
        }
        for (int a = 0; a < 3 ; a++) {
            for (int b = 0; b < 5; b++) {
                System.out.print(ar2[a][b]+ " ");
            }
            System.out.println();
        }

        //длина массива ar[].length[x]




    }
}
