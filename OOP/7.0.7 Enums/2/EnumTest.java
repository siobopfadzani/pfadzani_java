public class EnumTest {
	public static void main(String[] args) {
		SeasonsOfTheYear Seoson1 = SeasonsOfTheYear.Summer;
		SeasonsOfTheYear seoson2 = SeasonsOfTheYear.Winter;
		 
		boolean res1 = Seoson1.equals(seoson2);
		 
		System.out.println(Seoson1+" equals "+seoson2+" is "+res1);
 
	}
 
}
