public class practice{
  public static void main(String[]args){
  	double x = 22.5;
  	double y = 42.25;
  	x = ++y * x % 10 + x/2;
  	y = y % 10;
  	System.out.println(x + " : " + y);
  }
}
