public class MorphMain2
{
    public static void main(String[]args)
    {
        EnglishBook English = new EnglishBook();
        Object  inst1 = English;
        Object  target = English;
        inst1 = (EnglishBook)target;
    }
}
