public class question57
{
  
    public static void main(String[]args)
    {
  // breakdown of code to see the sequence of the code
      label:
            for (int i =0;i <6;i++)
            {
              System.out.println("loop 1 ");
              System.out.println("i is "+ i);

              for(int j=0;j <5;j++)
              {
                System.out.println("loop2 value of j " + j);
                System.out.println("loop2 i is "+ i);

                if(i==3||j==2) continue label;
                System.out.println("after the if statement");
                System.out.println("i = " + i +"; j = " +j);
              }
         }
  // orignal code
      label:
            for (int i =0;i <6;i++)
            {
              for(int j=0;j <5;j++)
              {
                if(i==3||j==2) continue label;
                System.out.println("i = " + i +"; j = " +j);
              }
         }
    }  

}
