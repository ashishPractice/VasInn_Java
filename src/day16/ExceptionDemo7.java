package day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo7 {

    public static void main(String[] args) {
        parseDataToString();
        try {
            parseStringToDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void parseDataToString() {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String formattedDate = sdf.format(d);
        System.out.println(formattedDate);
    }

    public static void parseStringToDate() throws ParseException {
        String s = "2021-03-11 10:16:24 AM";
        System.out.println(s);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        Date d = sdf.parse(s);
        System.out.println(d);
    }
}
