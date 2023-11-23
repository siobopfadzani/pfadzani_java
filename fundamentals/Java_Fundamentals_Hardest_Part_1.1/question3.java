public class question3 {
    public static void main(String[]args){

        //breakdown trying to figure out the operator sequence

        int a = 3;
        int b = -4;
        int c = 8;
        int d = -3;
        int result1= a*b;
        System.out.println("first result =" + result1);

        int result2 = result1/ c;
        System.out.println("second result =" + result2);

        int final1 = result2*d;
        System.out.println("breakdown result = " + final1);

        //original code

        System.out.println(3*(-4)/8*(-3));
        } 
}
