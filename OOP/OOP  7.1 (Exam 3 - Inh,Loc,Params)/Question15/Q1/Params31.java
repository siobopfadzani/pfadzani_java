public class Params31
{
    public static  void main(String[]args)
    {
        Printer printer = CreatePrinter("peter");

        //printer.print();
    }
    private static Printer CreatePrinter(final String name)
    {
       return new Printer(){
            @Override
            public void print(){
                System.out.print("hello : "+ name);
            }

        };
    }
}
