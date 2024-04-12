public class Q3
{
  public static void main(String[]args)
  {
    int i = 0;
    for (;i<2;i+=5)
    {
       if (i<3)
       continue;
       System.out.println(i);
    }
    System.out.println(i);
  }
}
