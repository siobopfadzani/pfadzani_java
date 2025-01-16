package Question;
import java.util.List;
import java.util.ArrayList;
public class Main { 
      public static void main(String[] args) { 
       
        int myValue = 0; 
        int x = 3; 
        while(myValue++ < 3) { 
          int y = (1 + 2 * myValue) % 3; 
          switch(y) { 
             default: 
             case 0: x -= 1; break; 
             case 1: x += 5; 
          } 
        } 
      System.out.println(x); 
     } 
    }