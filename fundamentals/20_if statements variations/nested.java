public class NestedIf {
    public static void main(String args[]) {

    	int a = 10; // Outer 'a' variable

		{
  		  a = 30; // Inner 'a' variable shadows the outer 'a' in this block
  		  System.out.println(a); // This refers to the inner 'a' with the value 30
		}
			System.out.println(a); // This refers to the outer 'a' with the value 10

	}
}