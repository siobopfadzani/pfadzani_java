package Exam5.Question35;

 interface Printable
{
    void print();
    default void displauInfo()
    {
        System.out.println("this is printable");
    }
}
interface Scannable extends Printable
{
    void scan();
    default void displayInfo()
    {
        System.out.println("this is scannable");
    }
}
public class Document implements Scannable
{
    private String content;
    public Document(String content)
    {
        this.content = content;
        System.out.println(this.content);
    }
    @Override
    public void print()
    {
        System.out.println("printing "+content);
    }
    @Override
    public void scan()
    {
        System.out.println("scanning document");
    }
    @Override
    public void displayInfo()
    {
        Scannable.super.displayInfo();
    }
    public static void main(String[] args) {
        ConfidentialDocument doc = new ConfidentialDocument("secret content ", "top secret");
    }
}
class ConfidentialDocument extends Document
{
    private String securityLevel;
    ConfidentialDocument(String content, String securityLevel)
    {
        super(content);
        this.securityLevel = securityLevel;
    }
    @Override
    public void print()
    {
        System.out.println("printintg document security level: " +securityLevel);
        super.print();

    }
}