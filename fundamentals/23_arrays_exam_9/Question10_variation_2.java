public class Question10_variation2
{
	public static void main(String[]args)
	{
		final Object[][] objArr = {{null},{null}};

		for (int i = 0;i < objArr.length;i++)
		{
			for(int j = 0;j < objArr[i].length;j++)
			{
				System.out.println(objArr[i][j]+ " ");
			}
		}
	}
}