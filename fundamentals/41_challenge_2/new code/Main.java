public class Main{

public static void main(String args[]){
  String firstValue = Prompter.prompt("please enter your first number");
  String arithmaticOperator = Prompter.prompt("please enter which Arithmatic operator you wish to use multiplication * Addition + or subtraction - ");
  String secondValue= Prompter.prompt(" please enter the second value ");
  
   /*Addition addition = new Addition();
   double addedResult = addition.addition(firstValue, arithmaticOperator, secondValue);
   System.out.println("Result: " + addedResult);*/
   
   Multiplication multiply = new Multiplication();
   double multipliedResults = Multiplication.multiplication(firstValue, arithmaticOperator, secondValue);
   System.out.print("multiplied results" + multipliedResults);
   
   Subtraction subtraction = new Subtraction();
   double subtractedResults = Subtraction.subtraction(firstValue, arithmaticOperator, secondValue);
   System.out.println("subtracted results" + subtractedResults);
   }
}
