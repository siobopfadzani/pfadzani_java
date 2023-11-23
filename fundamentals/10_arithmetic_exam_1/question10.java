public class question10
{
	public static void main(String[]args)
	{
	//breakdown of code to show the sequence of the code
		System.out.println(10*5+100*(25*11)/(25*10)*10-5+7%2);
		int a = 25*11;
		int b = 25*10;
		int c = a/b;
		int d = c * 100;
		int e = d * 10;
		int f = e + (10*5);
		int g = 7%2;
		int h = g + f;

		System.out.println("result at breakdown " + h)

	//Original code

		System.out.println(10*5+100*(25*11)/(25*10)*10-5+7%2);
		int zx = (10*5+100*(25*11));
		int yz = ((25*10)*10-5+7%2);
		System.out.println(zx/yz);
	}
}