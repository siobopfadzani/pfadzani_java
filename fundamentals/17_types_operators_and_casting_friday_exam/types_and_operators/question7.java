public class question7
{
	public static void main(String[]args)
	{
		int x = 10;
		--x;
        int y = 5;
        y++;

        int z = (x < y) ? (x = 5) : (y = 10);

		System.out.println("z "+z);
	}
}