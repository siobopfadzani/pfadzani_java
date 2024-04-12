public class question13 {
    public static void main(String[]args)
    {
        // breakdown trying to figure out the operator sequence
        char a;
        int b;
        a = 'a';
        System.out.println(("a =")+ a);
        b = a;
        System.out.println(("b =")+ b);
        b--;
        System.out.println(("b =")+ b);
        b = a;
        System.out.println(("b =")+ b);

        //original code
        System.out.println("a is : "+ a +" then "+ "b is : "+ b);
    }
}
