public class practice{
  public static void main(String[]args){
  	int x = 42;
  	double y = 42.25;
  	x = --x * x % 10 + x/2;
  	y = y % 10;
  	System.out.println(x + " : " + y);
  }
}
