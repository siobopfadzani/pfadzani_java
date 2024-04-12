public class loops {
    public static void main(String[] args) 
    {
       
       printmax(34,3,3,2,56.5);
       
       printmax(new double []{1,2,3});
     }
     
     public static void printmax(double ... numbers)
     {     
       if(numbers.length ==0)
        {
          System.out.println("No argument passed ");
          return;
        
        }
        
        double result = numbers[0];
        
        for (int i=0;i<numbers.length;i++)
           if (numbers[i]>result)
              result= numbers[i];
              System.out.println("The max value is " + result);
           
     }
  
}

