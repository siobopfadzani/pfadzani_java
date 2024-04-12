public class practice{
  public static void main(String[]args){
  	int x = 55;
  	int y = 55;
  	x = --x * x % 10 + x/2;
  	y = y % 10;
  	System.out.println(x + " : " + y);
  }
}
