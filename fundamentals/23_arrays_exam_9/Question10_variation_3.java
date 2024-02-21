abstract class try_catch_test1
{
	public static void main(String[]args)
	{
        final Object[] objArr = {null};
        Object[] objArr1 = objArr;

        for (int i = 0;i < objArr.length;i++)
        {
            System.out.println(objArr1[i] +" ");
        }
	}
}