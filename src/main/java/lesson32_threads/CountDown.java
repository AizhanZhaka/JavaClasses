package lesson32_threads;

public class CountDown extends Thread{

    @Override
    public void run() {
        for (int i = 20; i >= 0; i--) {
            System.out.println("Осталось " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Вы в 2020 году");
    }
}
