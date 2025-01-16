package Question44;
import java.time.*;
public class Main {

    public static LocalDate process(LocalDate id)
    {
        LocalDate id2 = id.plus(Period.ofMonths(1).ofDays(1));
        // LocalDate ld2 = ld.plus(Period.of(0, 1, 1));
        return id2;
    }
    public static void main(String[] args) {
        
        System.out.println(process(LocalDate.now()));
    }
    
}
