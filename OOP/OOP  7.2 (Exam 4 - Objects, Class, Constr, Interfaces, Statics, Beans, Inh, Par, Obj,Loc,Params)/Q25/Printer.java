public class Printer
{
    private String name;
    public Printer()
    {
        this("Default");
    }
    public Printer(String name)
    {
        this.name = name;
        System.out.println((this.name));
    }
    public static void main(String[]args)
    {
        Printer printer = new Printer();
    }
}
