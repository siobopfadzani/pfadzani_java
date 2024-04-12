public class ArrayCopy1
{
	public static void main(String[]args)
	{
		printMax(34,3,3,2,56.5);
		printMax(new double[]{1,2,3});

	}
	public static void printMax(double... numbers)// ellipsis or varargs (variable-length argument) . it allows you to checks the length of the argument.

	{
		if (numbers.length == 0 )
		{
			System.out.println("no arguments passed");
			return;
		}
		double result = numbers[0]; // this declaration of variable result helps us to have a starting point in checking which value is the greatest
		for(int i =0;i <numbers.length;i++)
		{
			if(numbers[i]>result) result = numbers[i];
		}
		System.out.println("the max value is " +result);
	}
}