public class Exceptions5
{
	public static void main(String[]args)
	{
		for (int a = 0; a <  10;++a)
		{
			try
			{
			   if (a % 2 == 0) throw new Exception("Except 1");
				try
				{
					if (a % 2 == 1) throw  new  Exception("exception2");
					System.out.println(a);
				}
				catch (Exception in)
				{
					a *= 2;
				}
				finally 
				{
					++a;
				}
			} 
			catch(Exception out)
			{
				a += 3;
			}
			finally
			{
				++a;
			}
		}
	}
}