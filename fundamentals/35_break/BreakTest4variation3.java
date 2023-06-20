public class breaktest{

	public breaktest(){
	int val1 = 0;
	
	label:for (int val = 0;val <5;val++){
	   
	   	System.out.println("print = " +val);

		if (val==2){
		break label;
		}
		
		while (val1 < 3){
		System.out.println("print val1 = " +val1);
		val1++;
		}
		break;
	    }

	}
	

   public static void main(String[]args){
	breaktest object = new breaktest();
   }
}
