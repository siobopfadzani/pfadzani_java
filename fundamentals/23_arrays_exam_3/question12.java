public class question12
{
	public static void main(String[]args)
	{
		String [] a = new String[]{"a","e","i","o","u"};
		String [] b = new String[3];

		for (int i = 0; i < b.length;i++)
		{
			b[i] = " \"\"";
			// System.out.print(b[i]);
		} 
		System.arraycopy(b, 0,a,0, b.length-2);


		for (int i = 0; i < b.length;i++)
		{
			System.out.print(b[i] + ",");
		}
	}
}