public class NumberValidator {

    public static boolean isValid(String valid) {
    

        if ((valid == null || valid.matches("[a-zA-Z_]+"))||valid.isEmpty())
         {
            
            return false;
          }
           
          return true;
   }
}

