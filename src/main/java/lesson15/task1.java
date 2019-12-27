package lesson15;

public class task1 {
    public static void main(String[] args) {
        int hour = 19;
        int min = 0;
        int sec = 0;
        while (hour < 21){
            sec++;
            if (sec == 60){
                min++;
                sec = 0;
                if(min == 60){
                    hour++;
                    min = 0;
                }
            }

            if (hour < 10) {
                System.out.print("0");
            }
            System.out.print(hour + ":");
            if (min < 10){
                System.out.print("0");
            }
            System.out.print(min + ":");
            if (sec < 10) {
                System.out.print("0");
            }
            System.out.println(sec);

            //System.out.printf("%02d:%02d:%02d\n", hour, min, sec);
        }
    }
}
