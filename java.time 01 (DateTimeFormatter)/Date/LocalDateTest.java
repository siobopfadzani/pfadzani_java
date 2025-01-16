package Date;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
   		 LocalDateTime currentDate =LocalDateTime.now();   
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
		 String month = formatter.format(currentDate);
   		 System.out.println("today’s Date is : " + month) ;
   		 
    }
}

