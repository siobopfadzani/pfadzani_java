package Question271;

class Holder{
    int value = 1;
    Holder link;
    public Holder(int val){ this.value = val; }
    public static void main(String[] args){
     final Holder a = new Holder(5);
     Holder b = new Holder(10);
     a.link = b;
     b.link = setIt(a, b);
     System.out.println(a.link.value+" "+b.link.value);


     System.out.println("12345".charAt(5));
    //  System.out.println("12234567".charAt('0'));
    }
    
    public static Holder setIt(final Holder x, final Holder y){
       y.link = x.link;
        return x;
    }


    
 }