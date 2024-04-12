abstract class try_catch_test1
{
	public static void main(String[]args)
	{
        final Object[] objArr = {null,"heloo","null",123,"hello",0.2,"hi"};
        final Object[][]objArr1 = new Object[1][8];
        objArr1[0] = objArr;

        for (int i = 0;i < objArr1.length;i++)
        {
            for(int j = 0;j < objArr1[i].length;j++)
            {
                System.out.println(objArr1[i][j] +" ");
            }
        }
	}
}