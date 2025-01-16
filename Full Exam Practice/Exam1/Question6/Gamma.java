package Exam1.Question6;

public class Gamma extends Beta
{
    String getType()
    {
        return "Gamma";
    } 
    public static void main(String[] args) {
        Alpha al = new Gamma();
        Alpha al2 = new Gamma();
        System.out.println(al.getType() + " "+ al2.getType());

    }   
}
class Alpha 
{
    String getType()
    {
        return "Alpha";
    }

}
class Beta extends Alpha
{
    String getType()
    {
        return "Beta";
    }
}
