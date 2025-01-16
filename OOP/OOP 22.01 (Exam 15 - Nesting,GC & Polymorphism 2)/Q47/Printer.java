package Q47;
public class Printer
{
    public static void main(String[] args) {
        PaperCollection paper = new PaperCollection();
        paper.print();
        System.out.println(" " + paper.toString());
    }
}
class PaperCollection 
{
    public static void print(){System.out.print("paperCollection.print()");}
    @Override
    public String toString(){return "PaperCollection";}
}
class Book extends PaperCollection
{
    public static void print(){System.out.println("Book.Print()");}
    @Override
    public String toString(){return "Book";}
}
