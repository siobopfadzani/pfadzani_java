
import java.util.Scanner;

public class Subtraction{
   public double subtraction (String FistValue, String arithmaticOperator,String secondValue){
   
      double num1 = Double.parseDouble(FistValue);
      double num2 = Double.parseDouble(secondValue);
      double result = 0.0;
      
      
      switch (arithmaticOperator){
         case "-" :
         {
            result = num1 - num2; 
            break;
         }
      }
       return result;
   }

}  

