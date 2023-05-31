public class Test{
   public static void main(String[]args){
   
      int guess = 7;
      int answer =9;
     
      
      if ((guess<answer)&&(guess>answer)?(guess>answer)? false: true: false){
      	System.out.println("your guess is too high");
      }
      else if ((guess==answer)||(guess>answer)?true: false){
      	System.out.print("you are right");
      }
      else{
      	System.out.println("you guess is too high");
      }
   }
}
