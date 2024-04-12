import java.util.Vector;

public class contains{

public contains(){
  
  Vector<String> vector =new Vector<>();
  
  vector.add("mac");
  vector.add("dell");
  vector.add("lenovo");
  if (vector.contains("hp")){
    System.out.println("there is an HP machine");
  }
  else if(vector.contains("mac")){
    System.out.println("there is a mac");
  }


}

public static void main(String[]args){
    
      contains GetName = new contains();
   }
}
