public class Q15{
   
   public static void main(String[]args)
   {
     byte num = 120;
     
     switch(num)
     {
        default:
        System.out.println("default");
        case 2:
          System.out.println("2");
        case 120:
           System.out.println("120");
        case 121:
          System.out.println("121");
          break;
         case 127:
          System.out.println("127");
          break;
     }
   }

}
