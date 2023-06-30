
public class PopulateData{

	public void populate() {
	
	   Integer[] array = new Integer[50];
	   
	     for (int i = 0; i < 50; i++){
		array[i] = i +1;
	     }
	     
	     for (int i =0; i < 50;i++){
	     	System.out.println(array[i]);
	     }
	     for (int i =0; i < 50;i++){
	     	array[i] = array[i] +1;
	     }
	     for (int i = 0;i <50;i++){
	     	System.out.println(array[i]);
	     }
	
	}
	
       public static void main(String[]args){
   	PopulateData objct = new PopulateData();
   	objct.populate();
   }
}
