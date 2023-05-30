public class Test{
	public static void main(String[]args){
	
	int a = 2000;
	String results=((a%4==0)&&(a%100==0)&&(a%400==0)?(a%400==0)? "first":"second":"third");
	System.out.println(results);
	
	}
}
