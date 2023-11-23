public class IfElseLadderExample {
    public static void main(String args[]) {
       
      int number = 42;
      String result = (number % 2 == 0) ? "even" : (number % 3 == 0) ? "divisible by 3" : "odd";
      System.out.println(result);

    }
}
