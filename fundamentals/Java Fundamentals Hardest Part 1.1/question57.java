public class question57
{
    public static void main(String[]args)
    {
      label:
            for (int i =0;i <6;i++)
            {
              for(int j=0;j <5;j++)
              {
                if(i==3||j==2) continue label;
                System.out.println("i = " + i +"; j = " +j);
              }
            }
    }  

}
