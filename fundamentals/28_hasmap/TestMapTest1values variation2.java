import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String,String> hashMap = new HashMap<>();
		
		hashMap.put("pfadzani", "siobo");
		hashMap.put("matshepo", "siobo");
		hashMap.put("oritonda", "siobo");
		hashMap.put("maria", "numbers");
		hashMap.put("senzo", "tsotetsi");
		hashMap.put("okonko", "tshitewa");
		hashMap.put("fundiswa", "zulu");
		
		
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

