public class Country
{
    static int coutryCounter;
    String name;
    static String name1;
    int dummyCounter;


    public static void main(String[]args)
    {
        Country ob1 = new Country();

        ob1.name = "name";
        Country.name1 ="name1";
        ob1.dummyCounter++;

        Country ob2 = new Country();

        ob2.dummyCounter++;
        ob2.name = "obj2  name";
        ob2.name1 = "obj2 name1";
        Country.coutryCounter++;

        System.out.println(name1);
        System.out.println(ob1.name);
    }
}
