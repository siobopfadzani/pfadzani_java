package Q28;
public class GC11
{
    Short story = 200;

    GC11 go (GC11 cb)
    {
        cb = null;
        return cb;
    }
    public static void main(String[] args) {
        GC11 c1 = new GC11();
        GC11 c2 = new GC11();
        GC11 c3 = c1.go(c2);
        c1 = null;


        
    }
}