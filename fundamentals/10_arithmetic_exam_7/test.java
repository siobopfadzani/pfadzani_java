public class test
{
	public static void main(String[]args)
	{
		int apples = 9;
		double bananas = 17.0;

		bananas = apples++ * (bananas-- / (apples-- + 3.0));
		System.out.println("first arithmetic = " + bananas);
		bananas++;
		System.out.println("first arithmetic = " + bananas);
		apples = (int)(bananas * 2);
		System.out.println("first arithmetic = " + apples);
		bananas = ++bananas % apples--;
		System.out.println("apples = " + apples);
		System.out.println("bananas = " + bananas);
	}
}
