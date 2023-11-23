public class question37 {
    public static void main(String[]args)
    {
         int i =1234567890;

        //breakdown

         float b = i;
         int c =(int)b;
         int total = i - c;

         System.out.println("breakdown result: "+ total);

        //Original code
       
        float f = i;
        System.out.println("original result"+i -(int)f);
    }
    
}
