import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String,String> hashMap = new HashMap<>();
		
		hashMap.put("south Africa", "pretoria");
		hashMap.put("ghana", "accra");
		hashMap.put("tanzania", "Dar e salaam");
		hashMap.put("angola", "Algiers");
		hashMap.put("Uganda", "luanda");
		hashMap.put("zimbabwe", "harare");
		hashMap.put("Zambia", "lusaka");
		
		
		Collection <String> value = hashMap.values();
		
		for(String value1 : value){
		   System.out.println(value1);
		}
		
		
		Set <String> keyset = hashMap.keySet();
		for (String key : keyset){
		
		System.out.println(key);
		}
		
	       	
	}	
}

