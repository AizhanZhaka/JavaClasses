package lesson34;

import java.util.Scanner;

public class ScannerThreadExample {
    public static void main(String[] args) {
//        ScannerThread th = new ScannerThread();
        ScannerThread2 th = new ScannerThread2();
        th.start();

        Scanner in = new Scanner(System.in);


        int n = 1;
        while (n != 0) {
            n = in.nextInt();
            if (n != 0) {
                th.counter = n;
            } else {
//                th.running = false;
                th.interrupt();
            }
        }
        System.out.println(th.counter);

    }
}


class ScannerThread2 extends Thread {

    long counter = 0;

    @Override
    public void run() {
        while (isInterrupted() == false) {
            counter++;
            System.out.println("Counter " + counter++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                interrupt();
//            }
            }
        }
    }

    class ScannerThread3 implements Runnable {

        long counter = 0;

        @Override
        public void run() {
            while (Thread.currentThread().isInterrupted() == false) {
                counter++;
                System.out.println("Counter " + counter++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}