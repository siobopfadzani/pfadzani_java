public class test1
{
	public static void main(String[]args)
	{
		double a =10.5;
		double b =2;
		double c ;
		++a;
		a += a++;

		c = ++a%--b *b++;
		System.out.println("c = " +c);
	}
}