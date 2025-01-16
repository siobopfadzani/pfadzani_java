package NestingExam2.Question14;
interface Calucable{
    String create (String name , String surname);
    default String concat(String name,String surname)
    {
        return name + " _ "+ surname;
    }
    default String myMethod(Calucable a, String name, String surname)
    {
        return a.concat(name, surname);
    }
    default int age(int b, Operation op)
    {
        return b * 2;
    }
}
 interface  Operation {

    int execute (Calucable obj, int a , int b);
}
public class Main {
    
    public static class subtractionOperation implements Operation 
    {
    
        public int execute(Calucable obj, int a, int b)
        {
            return a - b;
        }    
    }
    public static class customCaluculable implements Calucable 
    {
    
        public String create(String name, String surname)
        {
            return name.toUpperCase() + "_"+ surname;
        }    
    }
}
