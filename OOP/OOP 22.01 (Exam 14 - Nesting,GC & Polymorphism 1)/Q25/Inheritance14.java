package Q25;

public class Inheritance14 {
    public static void main(String[] args) {
        Inheritance11 [] a = {new Inheritance11(),new Inheritance12(),new Inheritance13()};
        for(Inheritance11 a2 : a)
        {
            a2.m1();
            if(a2 instanceof Inheritance12|| a2 instanceof Inheritance13)
            {
                ((Inheritance12)a2).m2();
            }
        }
    }
    
}
