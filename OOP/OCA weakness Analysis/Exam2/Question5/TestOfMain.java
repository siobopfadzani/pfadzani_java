package Exam2.Question5;

public class MainClass implements Interface2{
    public static void main(String[] args) 
    {
          MainClass cL = new MainClass();
          cL.method();
    }
    public void method()
    {
        System.out.println(i+ " "+ tough);
    }
    
}
interface Interface1
{
    int i = 10;
    Integer tough = 100;
    void method();
    
}
interface Interface2 extends Interface1
{
    void method(); 
      
}
