public class IfElseLadderExample {
    public static void main(String args[]) {

      //Ternary operator

       int x = 5;
       String result = (x < 0) ? ((x < 10) ? "x is between 0 and 10" : "x is not between 0 and 10") : "x is not greater than 0";
       System.out.println(result);

        int y = 10;

      //IF Statement
      
        if(y < 0)
        {
            if(x<10)
            {
               System.out.println("x is between 0 and 10");
            }
            else {
               System.out.println("x is not between 0 and 10");
            }
        }
        else
        {
          System.out.println("x is not greater than 0");
        }

    }
}
