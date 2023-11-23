public class question31
{
	public static void main(String[]args)
	{
		if (args.length<2)
		{
			System.out.println("please provide two arguments");
		}
		else if(args[0].equals("open"))
		{
			if(args[1].equals("someone"))
			{
				System.out.println("hello");
			}
			else
			{
				System.out.println("go away " +args[1]);
			}
		}
	}
}