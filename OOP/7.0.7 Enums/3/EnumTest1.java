public class EnumTest1 {
	public static void main(String[] args) {
		SeasonsOfTheYear[] values = SeasonsOfTheYear.values();
		 
		for(SeasonsOfTheYear day:values){
			System.out.println(day);
		}
	}
}
