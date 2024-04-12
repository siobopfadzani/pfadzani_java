public class question3 
{
	public static void main(String[]args)
	{
		int x1 = 5;
		int x2 = x1++;
		int x3 = -x2/ --x1 * ++x2;

		boolean b = x2-- > x3++;
		if(b)
		{
			return -x3;
		}else{
			return ++x1 / x2-- * ++x3;
		}
	}
}