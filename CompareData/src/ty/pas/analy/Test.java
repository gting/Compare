package ty.pas.analy;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        String fromDate = simpleFormat.format("2016-05-01 12:00");
        String toDate = simpleFormat.format("2016-05-01 14:00");
        long from = 0;
        try {
            from = simpleFormat.parse(fromDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long to = 0;
        try {
            to = simpleFormat.parse(toDate).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int hours = (int) ((to - from)/(1000 * 60 * 60));
        System.out.println(hours);
    }
}
