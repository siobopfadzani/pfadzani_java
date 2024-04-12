import java.util.Vector;
public class Get{
public Get(){
	Vector<String> names= new Vector<>();
	
	names.add("jerry");
	names.add("mary");
	names.add("alroy");
	names.add("jermy");
	
	Vector<String> names1 = new Vector<>();
	
	names1.add("hakhakhi");
	names1.add("mulaudzi");
	names1.add("sarah");
	
	names.addAll(names1);
	System.out.println(names);
}

public static void main(String[]args){

	Get GetNames = new Get();
   }
}
