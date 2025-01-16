package ArrayLisr.DateAndTime;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javax.swing.text.DateFormatter;

public class DateTimesClass {
    public static void main(String[] args) {

        LocalDate dates = LocalDate.of(2015, Month.APRIL, 01);
        dates = dates.plusDays(10);
        dates = dates.plusMonths(10);

        System.out.println(dates);


        LocalTime times = LocalTime.now();
        System.out.println(times);


        LocalTime times1 = LocalTime.of(10,30);
        times1 = times1.plusHours(5);


        LocalDateTime datesTime = LocalDateTime.of(dates,times1);
        System.out.println(datesTime);


        DateTimeFormatter formatDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(formatDate.format(datesTime));

        // DateTimeFormatter formatTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        // System.out.println(formatTime.format(times));


        String a = "";
        a += 2;
        a += 'c';
        a += false;

        if(a == "2cfalse")System.out.println("hi");
        
    }
    
}
