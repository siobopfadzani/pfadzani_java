package Exam2.Question60;
interface Flyer{
    String getName();}

   
public class TestClass {
    
    public static void main(String[] args) {
        Flyer f = new Eagle("American bald Eagle");
        System.out.println(((Bird)f).getName());
        
    }
    
}
class Bird implements Flyer
{
    public String name;
    public Bird(String name)
    {
        this.name = name;
    }
    public String getName(){return name;}
}
class Eagle extends Bird
{
    public Eagle(String name ){
        super(name);
    }
}