package Question19;

public class A {
    
}

class B extends A {
    public static void main(String[] args) {
        B o = new B();  
        boolean c = (o instanceof B) && (!(o instanceof B)); 
        System.out.println(c);
        boolean d = !((o instanceof A)||(o instanceof B));
        System.out.println(d);
        boolean e = (o instanceof B)&&(!(o instanceof C));
        System.out.println(e);
        boolean f = !(!(o instanceof B)||(o instanceof C));
        System.out.println(f);
        boolean g = (o instanceof B)&&!((o instanceof A)||(o instanceof C));
        System.out.println(g);
    }
 
    
}

class C extends B {}  
