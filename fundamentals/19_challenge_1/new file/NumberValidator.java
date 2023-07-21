public class NumberValidator {
    public static boolean numberValidator(String distance, String prompt) {
    
    boolean goback = Boolean.parseBoolean(prompt);
        if (distance == null || distance.isEmpty()) {
            System.out.println("Distance provided not valid");
            return false;
        }else{
           return goback;
           
        }
   }
}

