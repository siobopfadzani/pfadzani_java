public class MixInstEg3{
    static int myVar = 4;
    static int myVar2 = 2;

    int getDifference(){
        return myVar2 - myVar;
    }
    public static void main(String[]args)
    {
        MixInstEg3 obj = new MixInstEg3();
        System.out.println(obj.getDifference());
    }
} 

