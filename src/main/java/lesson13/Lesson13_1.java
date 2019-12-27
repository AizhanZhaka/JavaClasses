package lesson13;

public class Lesson13_1 {
    public static void main(String[] args) {
        int ar2[][] = new int [3][];  //чтобы задать только строку, а столбцы разной длины

        int t[] = new int[10];
        for (int i = 0; i < t.length; i++) {
            t[i] = 1;

        }

        ar2[0] = new int[4];
        ar2[1] = new int[2];
        ar2[2] = t;

        for (int i = 0; i < ar2.length ; i++) {
            for (int j = 0; j < ar2[i].length ; j++) {
                System.out.print(ar2[i][j] + " ");
            }
        System.out.println();
        }
    }
}
