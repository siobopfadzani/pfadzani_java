import java.util.Vector;

public class Add {
    public Add() {
        Vector<String> names = new Vector<>();
        
        names.add("pfadzani");
        names.add("siobo");
        names.add("matshepo");
        names.add("oritonda");
        names.add("nkhangweleni");
        names.add("salphinah");
        
        for (int a = 0; a < names.size(); a++) {
        if (a>=0){
            names.remove("pfadzani");
            System.out.println(names.get(a));
            }else{
            	System.out.println("end of code");
            }
        }
    }
    
    public static void main(String[] args) {
        Add getName = new Add();
    }
}

