import java.util.*;
public class maptest {

public static void main(String[] args) {  
    Map map=new HashMap();  
    //Adding elements to map  
         map.put(1,"Amit");  
         map.put(5,"Rahul");  
         map.put(2,"Jai");  
         map.put(6,"Amit");  
         map.remove(3,"pfadzani");
         map.put(3,"pfadzani");
         map.put(4,"tshepi");
        System.out.println(map);

            Set set=map.entrySet(); 
            Iterator itr=set.iterator();  
            while(itr.hasNext()){  
                //Converting to Map.Entry so that we can get key and value separately  
                Map.Entry entry=(Map.Entry)itr.next();  
                System.out.println(entry.getKey()+" "+entry.getValue());  
    }  
}  
}  