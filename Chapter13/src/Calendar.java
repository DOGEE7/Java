import java.util.Date;
import java.util.GregorianCalendar;
import java.util.*;

public class Calendar {
    public static void main(String[] args){
        Calendar calendar = new GregorianCalendar();
        System.out.println("current time: " + new Date());
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Date " + calendar.get(Calendar.DATE));
        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));

    }
}
