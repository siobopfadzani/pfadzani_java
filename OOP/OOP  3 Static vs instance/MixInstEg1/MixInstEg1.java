public class MixInstEg1{
    int myVar = 4;
    static int myVar2 = 2;


    int getDifference(){
        return myVar2 - myVar;
    }
    
        public static void main(String[]args)
    {
       MixInstEg1 obj = new MixInstEg1();
       int result =obj.getDifference();
       System.out.println(result);
    }
} 

