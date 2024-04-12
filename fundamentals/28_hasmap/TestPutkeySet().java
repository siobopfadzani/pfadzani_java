import java.util.Map;
import java.util.HashMap;
public class Put{

public Put(){
   Map <String, Integer> map = new HashMap<>(); 
   map.put ("guys",2);
   map.put("ladies",2);
   map.put("children",3);
   map.put("",4);
   

	System.out.println(map.keySet());
}
public static void main(String[]args){
	Put object = new Put();
}
}
