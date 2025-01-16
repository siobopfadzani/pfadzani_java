package DateTimeFormat2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDateTime = dateTime.format(formatter);

        System.out.println("Current Date and Time is: " + formattedDateTime);
    }
}
