package Question48;

 class Writter {
    public static void write()
    {
        System.out.println("writting...");
    }
    
}
class Author extends Writter{
    public static void write()
    {
        System.out.println("writing book");
    }
}public class Programmer extends Writter
{
    public static void write(){
        System.out.println("writing code");
    }
    public static void main(String[]args)
    {
        Writter w = new Programmer();
        w.write();
    }
}