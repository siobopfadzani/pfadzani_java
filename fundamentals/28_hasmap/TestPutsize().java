import java.util.Map;
import java.util.HashMap;
public class Put{

public Put(){
   Map <String, Integer> map = new HashMap<>(); 
   map.put ("guys",2);
   map.put("ladies",2);
   map.put("children",3);
   map.put("",4);
   
	int size = map.size();
	System.out.println(size);
}
public static void main(String[]args){
	Put object = new Put();
}
}
