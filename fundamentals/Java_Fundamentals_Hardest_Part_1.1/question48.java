public class question48 {

    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
    //code breakdown to see the sequence of the code
    
        boolean d = a==b;
        System.out.println(d);

        boolean e = a==c;
        System.out.println(e);

        boolean allEqual = d&&e;
        System.out.println(allEqual);

        System.out.println(allEqual?"all equal":"not all equal");



       //orginal code
        

        if (a == b && a == c) {
            System.out.println("all equal");
        } else {
            System.out.println("not all equal");
        }
    }
}
