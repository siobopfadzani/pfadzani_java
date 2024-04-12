public class LetsGetCertified
{
    public static void main(String[]args)
    {
        int x = 10;
        System.out.println("x = " + x);
        passPrimitive(x);
        System.out.println("x = " + x);
        x = passPrimitiveAndReturn(x);
        System.out.println("x = " + x);

        Spectacles specs = new Spectacles();
        System.out.println("lenses are " + specs.getLenses());
        
        passObjectReference(specs);
        System.out.println("lenses are " + specs.getLenses());
    }

    public static void passPrimitive(int a)
    {
        a = 50;
    }
    public static int passPrimitiveAndReturn(int b)
    {
        b = 50;
        return b;
    }

    static void passObjectReference(Spectacles spec)
    {
        spec.setLenses(1);;
    } 
}