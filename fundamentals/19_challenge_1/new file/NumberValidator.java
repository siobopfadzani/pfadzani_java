public class NumberValidator {
    public static boolean numberValidator(String distance) {
    

        if (distance == null || distance.isEmpty())
         {

            
            return false;
          }
          
        if (distance.matches("[a-zA-Z_]+"))
             {
               return false;
             }
               return true;
   }
}

