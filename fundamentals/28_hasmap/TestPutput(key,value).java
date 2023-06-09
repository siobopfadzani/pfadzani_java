import java.util.Map;
import java.util.HashMap;

public class Put {
    public Put() {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("number1", 1);
        map.put("number2", 2);
        map.put("number3", 3);
        
        System.out.println(map);
       
    }

    public static void main(String[] args) {
        Put getName = new Put();
    }
}

