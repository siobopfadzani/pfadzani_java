public class question14 {
    public static void main(String[]args){

   // breakdown trying to figure out the operator sequence
      
      int a = 20;;
      int b = 20;
      int c = 20;
      int d = 20;
      
      d = 20/20;
      System.out.println("d = " + d);

      c = d*20;
      System.out.println("c = " + c);

      b =c-20;
      System.out.println("b = " + b);

      a = b  + 20;
      System.out.println("a = " + a);
      
   //original code 
       a=b=c=d=20;
       a+=b-=c*=d/=20;
       System.out.println("a = "+ a +"; b = "+ b + "; c = "+ c + "; d = "+d);
    }
}
