package lesson15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HW15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите время:");
        String number = input.nextLine();
        int totalSec;


        String parts[] = number.split(":");
        int hour = Integer.parseInt(parts[0]) * 3600;
        int min = Integer.parseInt(parts[1]) * 60;
        int sec = Integer.parseInt(parts[2]);
        totalSec = hour + min + sec;
        System.out.println("Время в секундах = " + totalSec);

        Date day = new Date(totalSec * 1000);

        SimpleDateFormat stf = new SimpleDateFormat();
        stf.applyPattern("dd/MM/YY HH:mm:ss ");
        String str = stf.format(day);
        System.out.println(str);

    }
}
