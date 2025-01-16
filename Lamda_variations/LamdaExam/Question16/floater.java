public class floater  implements Innerfloater1{

    public static void main(String[] args) {


        // byte []Arry = new byte[]{72,101,108,108,111};
        // String A = new String(Arry);
        // // System.out.println(A);
        // StringBuilder Aff = new StringBuilder("hello2");
        // StringBuilder Affff = new StringBuilder(Aff);
        // // System.out.println(Affff);


        // Aff.append(" true, false");
        // Aff.append(" true");
        // String build = Aff.toString();
        // System.out.println(build);
        // System.out.println(Aff.compareTo(Affff));
        // Float num = Float.valueOf(444L);
        // // System.out.println(num.);


        // Float numer = new Float(4);
        // System.out.println(numer.compareTo(4F));

        double y = 20;
        String r = Double.toString(y);
        System.out.println(r);
        Character h = new Character('0');
        StringBuilder s = new StringBuilder(h);


        Character i = new Character('0');
        Double j = Double.valueOf(Character.getNumericValue(i));
        System.out.println(j);
        
        boolean b1 = false;
        boolean b2 = false;
            if (b2 != b1 != b2)
            {
                System.out.println("yes");
            }
            else{
                System.out.println("false");
            }

            

            floater nm = new floater();
            int su = nm.thevalue;
            int ku =  Innerfloater1.thevalue;
            int lk = thevalue;







        // String o = "20";
        // int u = new Integer(o);
        // System.out.println(u);

    //     Long value = 100000l;
    //     Byte v = value.byteValue();
    //     System.out.println(v);

    //     int j = 20;
    //     try 
    //     {
    //         int i = doIt()/(j=2);
    //     }
    //     catch(Exception e)
    //     {
    //         System.out.println("j == " + j);
    //     }
    // }
    // public static int doIt() throws Exception {throw new Exception("forget");}
    }
    
   
}
interface Innerfloater1 {
    int thevalue = 0;

    
}