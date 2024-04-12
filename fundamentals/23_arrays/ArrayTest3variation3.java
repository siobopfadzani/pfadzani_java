public class arraytest{
	public static void main(String [] args){
	 int b = 0;
	 String[]values = {"hi","hello","pfadzani","siobo","pfadzanisiobo"};
	 for (b=1;b<values.length;b++){
	 if (b<0){
	 System.out.println("no value found");
	 }
	 else if(b>=0){
	 System.out.println("index="+b+"greeting="+values[b]);
	 }
	 else{
	 System.out.print("end of code");
	 }
	 }
	}
}
