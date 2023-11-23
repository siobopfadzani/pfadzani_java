public class question70 {
    public static void main(String[]args)
    {
        int number = 496;
        int sum = 0;
        //breakdown code to show tthe sequence of the code

         for (int i =1;i < number; i++)
        {
            boolean a = number%i ==0;
            sum =(a==true)?sum=sum+1:sum; 
        }
        System.out.println((sum==number)?"yes":"no");
        
    
        //Original code
        
        for (int i =1;i < number; i++)
        {
            if(number%i==0) sum = sum +i;
        }
        System.out.println((sum==number)?"yes":"no");  
    }
}
    

