package Exam5.Question2;
import java.time.*;
import java.util.*;
public class MainTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        
        int b = z--;
        b += ++z;
        int answ = x>a?y>b?y:b:x>z?x:z;
        System.out.println();


        Integer nill =Integer.parseInt("808");
        System.out.println(nill);

        Runnable run = ()->{System.out.println("run");};
        Runnable run2 = ()->System.out.println("run");

        LocalDate date = LocalDate.of(2015, 3, 26);
        Period P = Period.ofDays(2);
        System.out.println(date.plus(P));





    }
    
}
 interface Runnable {
public void run();
    
}