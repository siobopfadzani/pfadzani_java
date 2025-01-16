package NestingExam2.Question11;


interface Calucable 
{
    String create(String name, String surname);
    default String concat(String name, String surname)
    {
        return String.format("%s %s", name,surname);
    }

    default String myMethod(Calucable a, String name, String surname)
    {
        return a.create(name, surname)+ " - "+ a.concat(name, surname);
    }
    default int age(int b, Operation op)
    {
        return op.execute(this,b,2);
    }
    
}

interface  Operation 
{

    int execute(Calucable obj,int a,int b);
}

public class Main {
    private static class PowerOperation implements Operation
    {
        public int execute (Calucable obj, int a, int b)
        {
            return (int)Math.pow(a, b);
        }
    }
    private static class customCaluculable implements Calucable
    {
        public String create(String name, String surname)
        {
            return name.replaceAll("[aeiou]","o")+ " "+surname.replaceAll("[aeipu]", "D");
        }
    }

    public static void main(String[] args) {
        Calucable calucable = new customCaluculable();
        Operation power = new PowerOperation();
        int result = calucable.age(3, power);
        System.out.println("age to power"+ result);
        System.out.println("created "+ calucable.create("hello", "World!"));
        System.out.println("mymethod "+ calucable.myMethod(calucable, "test", "case"));
    }
    
}
