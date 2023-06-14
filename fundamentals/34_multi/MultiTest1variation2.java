public class Test{
	
	public Test(){
	
   		int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
   		
   		for (int a = 0;a < numbers.length;a++){
   			System.out.println("Group = " + a);
   		   for (int b = 0; b < numbers[a].length; b++){
   		   	System.out.println("values "+ numbers[a][b]);
   		   }
   		}



	}
public static void main(String[]args){
	Test objct = new Test();

   }
}
