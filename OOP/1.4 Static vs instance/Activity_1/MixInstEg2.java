public class MixInstEg2{
    static int myVar = 4;
    static int myVar2 = 2;

    static int getDifference(){
        return myVar2 - myVar;
    }
    public static void main(String[] args) {
        int value = MixInstEg2.getDifference();
        System.out.println(value);
    }
} 
