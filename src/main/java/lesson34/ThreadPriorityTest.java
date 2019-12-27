package lesson34;

import java.util.Scanner;

public class ThreadPriorityTest {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        Priority p1 = new Priority("High");
        Priority p2 = new Priority("low");

        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.NORM_PRIORITY + 4);
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY - 4);

        t1.start();
        t2.start();

        t1.join();
        System.out.println("T1 joined");

        t2.join();
        System.out.println("T2 joined");

        System.out.println(p1.getCount());
        System.out.println(p2.getCount());

//        System.out.println("Введите количество потоков");
//        int a = in.nextInt();
//        while (a > 0){
//            Priority p = new Priority("Potok " + a);
//            Thread t = new Thread(p);
//            t.setPriority(a);
//            t.start();
//            a--;
//        }

    }
}

class Priority implements  Runnable{

    private long count = 0;

    static boolean stop = false;
    String name;

    public Priority(String name){
        this.name = name;
    }
    public long getCount() {
        return count;
    }




    @Override
    public void run() {
        while (stop != true && count < 100000){
            count++;
//            System.out.println(name + " - "+ count);
        }
        stop = true;
    }
}