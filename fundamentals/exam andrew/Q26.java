public class Q26
{
	public static void main(String[]args)
	{
		
		for(int ii = 0; ii<3;ii++)
		{
			int count = 0;
			for (int jj = 3;jj>0;jj--){
				if(ii==jj){
					++count;
					break;
				}
			}
			
			System.out.println(count);
			continue;
		}
	}
}
