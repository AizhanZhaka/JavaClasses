package lesson15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExample {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();  //показать время в данный момент
        System.out.println(time);

        Date date = new Date();
        System.out.println(date);
        //date.getTime();

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println("Hour" + hour);

        int month = cal.get(Calendar.MONTH);
        System.out.println("Month" + month);

        int maximum = cal.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Max DAY" + maximum);

        cal.add(Calendar.MINUTE, 73);  //можно и минус делать, чтобы откатить время

        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        System.out.println(cal.get(Calendar.MINUTE));

        cal.roll(Calendar.DAY_OF_MONTH, 2);
        Calendar today = Calendar.getInstance();

        System.out.println(today.before(cal));          // день до дня календаря
        System.out.println(today.after(cal));           //день после дня календаря
        System.out.println(today.compareTo(cal));       // если равны, то 0; если находится левее, то - ; если находится правее, то +

        System.out.println(cal.getTime());

        SimpleDateFormat stf = new SimpleDateFormat();
        stf.applyPattern("dd/MM/YY HH:mm:ss");              //задаем шаблон вывода
        String str = stf.format(today.getTime());
        System.out.println(str);
    }
}
