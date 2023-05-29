public class SwitchTest {
    public static void main(String[] args) {
       int a = 10;
       int b = 20;
       int c = 30;
       
       switch (a){
       case 20: {
   		System.out.println("we are here");
   	   }break;
   	   case 30:{
   	   System.out.println("are you ok");
   	   }break;
   	   case 10:{
   	   System.out.println(b*10 + " value of b multiplied by 10 ");
   	   }break;
   	   default :{
   	   System.out.println("code done");
   	   }
   	   
        }
        
        
        
        switch (b){
        case 10:{
        System.out.print("value of a");
        }break;
        case 20:{
        System.out.println(a*b*c + "value of b is multiplied by a b and c");
        }
        case 30:{
        System.out.println("end program");
        }
        }
       
    }
}


