package Exam2.Questtion2;

public class Interface1test implements Interface2{
    public static void main(String[] args) 
    {
        System.out.println(i);    
    }
    
}
interface Interface1
{
    int i = 10;
    Integer tough = 100;
}
interface Interface2 extends Interface1
{
    
}
