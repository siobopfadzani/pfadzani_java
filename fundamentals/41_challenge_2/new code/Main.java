public class Main {

    public static void main(String[]args) {
        
        while(true)
        {
        String FistValue = Prompter.prompt("please enter your first value");
          
        while (!NumberValidator.isValid(FistValue))
        {
        
          System.out.print("value entered not valid");
          FistValue = Prompter.prompt("please enter your first value");
          
        }

        Menu.showmenu();
        
        String choice = Prompter.prompt("enter arithmetic operator");   
           
        String secondValue = Prompter.prompt("please enter your second value");
      
          while (!NumberValidator.isValid(secondValue))
        {
        
          System.out.println("value entered not valid"+" ");
          secondValue = Prompter.prompt(" please enter your first value");
          
        }
        
        double value1 = Double.parseDouble(FistValue);
        double value2 = Double.parseDouble(secondValue);
        int pick =Integer.parseInt(choice);
                     
                        switch(pick)
                          {
                        
                           case 1 :
           
                              System.out.println("Total added value is :" + Addition.addition(value1,value2));
                              break;
                           case 2:
                              System.out.println("Total subtracted value is :" + Subtraction.subtraction(value1,value2));
                              break;
                           case 3:
                              System.out.println("Multiplied value is :" + Multiplication.multiplication(value1,value2));
                              break;
                           case 4:
                              System.out.println("divided value is :" + Division.division(value1,value2));
                              break;
                           case 5:
                              System.out.println("mod of the two values is :" + Modulus.modulus(value1,value2));
                              break;
                           case 0 :
                               System.out.println("program exiting...");
                               return;
                           default :
                               return;
                         }
        }
    }
}
