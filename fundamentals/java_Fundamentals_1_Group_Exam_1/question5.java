public class question5 
{
	public static void main(String[]args)
	{
		int mask = 0;
		int count = 0;

		if(( 5 <15 ) && (++count < 5))
		{
			count++;
		}
		if(12 >8||true)
		{
			++count;
		}
		if(!( mask > 1 || ++count > 1))
		{
			mask = mask +10;
		}
		System.out.println("mask is " +mask + " " +" count is " + count);
	}
}