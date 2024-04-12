public class question17 {

    public static void main(String[]args)
    {
        int x = 2;
        //breakdown trying to figure out the operator sequence
        
        int a = x+1;
        System.out.println("a = " + a);

        int b = a;
        System.out.println("b = " + b);

        int c = b+1;
        System.out.println("c = "+ c);

        int total = a + b + c ;
        System.out.println("result of breakdown = " + total);

        //original code

        int y = ++x + x++ + +x;
         System.out.println("result of original code " +y);

        
    }
    
}
