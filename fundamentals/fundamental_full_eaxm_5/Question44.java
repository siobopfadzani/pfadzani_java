public class Question44 
{
    public static void main(String[] args) 
    {
        int[] myarray = {1,2,3,4,5};
        ChangeIt.doIt(myarray);

        for(int j = 0;j < myarray.length;j++)
        {
            System.out.println(myarray[j]+ " ");
        }
    } 
}
class ChangeIt
{
    static void doIt(int[] z)
    {
        z[0] = 0;
    }
}
