public class Q3
{
	public static void main(String[]args)
	{
		Integer a = new Integer(10);
		Integer b = new Integer(30);
		Boolean c = a.equals(b);
		System.out.println(c);
		System.out.println(a.hashCode() == b.hashCode());

		
	}
}