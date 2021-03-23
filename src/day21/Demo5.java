package day21;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Demo5 {

    public static void main(String[] args) {
        System.out.println(new Date());

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        SimpleDateFormat sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        System.out.println(sdf.format(new Date()));

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(Instant.now());

    }
}
