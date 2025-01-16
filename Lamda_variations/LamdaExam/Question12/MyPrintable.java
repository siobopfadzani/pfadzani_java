

interface Printable
{
	String isPrintable(double d);
}

class MyPrintable implements Printable
{

	public static void main(String[]args)
	{
		Printable myprint = (d)-> "yes";
	}

	public String isPrintable(double d)
	{
		return "yes";
	}
}