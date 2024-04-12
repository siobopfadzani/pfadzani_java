public class MixInstEg1{
    int myVar = 4;
    static int myVar2 = 2;

    int getDifference(){
        return myVar2 - myVar;
    }
    public static void main(String[]args)
    {
        MixInstEg1 val = new MixInstEg1();
        System.out.println(val.getDifference());
    }
} 
