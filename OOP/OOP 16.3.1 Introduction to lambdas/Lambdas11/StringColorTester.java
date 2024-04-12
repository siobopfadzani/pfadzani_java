package Lambdas11;

import java.util.function.Predicate;

public class StringColorTester {

    public static void main(String[] args) {
      Predicate <String> stringColorTester = color -> color.equals("brown");
      boolean check = stringColorTester.test("blue");
      System.out.println("color is : " + check);
     }
}