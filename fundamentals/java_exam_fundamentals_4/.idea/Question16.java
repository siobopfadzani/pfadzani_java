public class Question16 {

    public static void main(String[] args) {
        
            try {

                    int i =0;
                    i= Integer.parseInt(args[0]);
                    System.out.println(i);

            } 
            catch (NumberFormatException e) {
                System.out.println("Problem in " + i);
            }
       
    }
}
