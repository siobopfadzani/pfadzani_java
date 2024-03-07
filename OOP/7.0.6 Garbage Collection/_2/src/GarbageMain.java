public class GarbageMain
{
    public static void main(String[]args) throws Throwable {
        Garbage garbage1 = new Garbage("garbage 1");
        garbage1.finalize();
        Garbage garbage2 = new Garbage("garbage 2");
        Garbage garbage3 = new Garbage("garbage 3");
        Garbage garbage4 = new Garbage("garbage 4");
        Garbage garbage5 = new Garbage("garbage 5");
        System.gc(); 
    }
}
