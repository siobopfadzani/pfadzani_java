import java.time.LocalDate;
import java.time.Period;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) { 
        LocalDate currentDate = LocalDate.now();
        LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
        
        Period p = Period.between(birthday, currentDate);
        
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                                                           " months, and " + p.getDays() + " days old.");

        Period reducedPeriod = Period.ofYears(p.getYears() - 5)
                .plusMonths(p.getMonths())
                .plusDays(p.getDays());
        
        
        System.out.println("Reduced by 5 = " + reducedPeriod.getYears()+" Years "+p.getMonths()+" Months "+p.getDays()+" Days ");
    }
}
