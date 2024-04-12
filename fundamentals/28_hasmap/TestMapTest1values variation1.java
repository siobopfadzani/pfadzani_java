import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapTest1 {
	public static void main(String[] args) {
		HashMap<String,String> hashMap = new HashMap<>();
		
		hashMap.put("12", "number 1");
		hashMap.put("13", "number 2");
		hashMap.put("24", "number 3");
		hashMap.put("33", "number 4");
		hashMap.put("rr", "number 5");
		hashMap.put("gt", "number 6");
		hashMap.put("qq", "number 7");
		
		
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

