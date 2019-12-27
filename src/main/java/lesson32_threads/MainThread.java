package lesson32_threads;


public class MainThread {

    public static void main(String[] args) {

        CountDown thread3 = new CountDown();
        thread3.start();

        MyThread thread = new MyThread("Gagarin");
        thread.start();

        MyThread thread2 = new MyThread("Titov");
        thread2.start();

        OneMoreThread runnable = new OneMoreThread();
        Thread thread4 = new Thread(runnable);
        //выше две строки можно написать следующим образом
        //Thread thread4 = new Thread(new OneMoreThread());
        //или так
        //new Thread(new OneMoreThread()).start();

        thread4.start();

        for (int i = 500; i < 600; i++) {
            System.out.println(i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
