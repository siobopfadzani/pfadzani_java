public class Main
{
    public static void main(String[] args) {
        double discount = 0;
        // int qty = Integer.parseInt(args[0]);


        StringBuilder sb = new StringBuilder("abc d ");
        StringBuilder sc = sb.append("null ");
        sc = sc.append("null null null");
        System.out.println(sb);
        System.out.println(sc);


        StringBuilder nope = new StringBuilder(10);

        System.out.println(nope.capacity());
        // nope.setLength(10);
        StringBuilder yesisaidno = nope.append("discounts1");
        System.out.println(nope.capacity()); 


        //delete & deletecharAt

        StringBuilder scb = new StringBuilder("abcdef");
        scb.delete(1, 3);
        System.out.println(scb);

        

    }
}