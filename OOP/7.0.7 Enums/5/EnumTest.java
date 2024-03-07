public class EnumTest {
	public static void main(String[] args) 
	{
		SeasonsOfTheYear [] Seosons = SeasonsOfTheYear.values();
		
		for (SeasonsOfTheYear year : Seosons)
		{
			System.out.println(year);
			System.out.println(year.getSeosonsOfTheYear());
		}
	}
	
}
