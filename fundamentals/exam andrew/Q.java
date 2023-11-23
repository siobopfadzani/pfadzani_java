public class Q22
{
	static int mx(int s)
	public static void main(String[]args)
	{
		for(int i = 0;i<3;i++){
			s =s+i;
		}
		return s;
		
		int s = 5;
		s+=s+mx(s)+ ++s;
		System.out.print(s);
	}
}
