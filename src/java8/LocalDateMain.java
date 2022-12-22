package java8;

import java.security.Signature;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LocalDateMain {
    public static void main(String[] args) {
//        Date date=new Date();
//        Calendar calendar= Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.set(Calendar.MONTH,2);
//        System.out.println(date);
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
//        System.out.println(simpleDateFormat.format(date));

        LocalDate localDate =LocalDate.now();
        localDate.minusDays(5);
        System.out.println(localDate);
        localDate.plusDays(4);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
