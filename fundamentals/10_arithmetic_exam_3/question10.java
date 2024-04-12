public class question10
{
	public static void main(String[]args)
	{

	//breakdown of code to see the sequence of the code
		double a = (25*11);
		a = a/(25*10);
		a = a*100*10;
		a = a -5+(7%2);
		a =(a + (10*5));
		int b = (int)a;
		System.out.println("arithmetic operation at the breakdown " + b);


		double z = 25*11;
		z = z*100;
		z =z+(10*5);
		int w = (int)z;
		System.out.println("value before division " + w);


		double y = (25*10);
		y = y * 10;
		y = y +(7%2)-5;
		int q = (int)y;
		System.out.println("value2 before division " + q);

		
		int total = w/q ;
		System.out.println("value of divion at breakdown " + total);

	//Original code
		System.out.println("arithmetic operation " + (10*5+100*(25*11)/(25*10)*10-5+7%2));
		int zx = (10*5+100*(25*11));
		int yz = ((25*10)*10-5+7%2);
		System.out.println("zx divided by yz = "+ zx/yz);
	}
}