import java.util.Comparator;

class Latin
{
	public static void main(String[]args)
	{
		String word = "hello";
		SuffixFunction suffixFunc =()-> System.out.println(word +" ay ");
		// word = " e";
		suffixFunc.call();
		
        // Comparator<Integer> comparator = (a, b) -> Integer.compare(a, b);

        // Compare two integers
        // int result = comparator.compare(10, 10);

        // Output the result
        // if (result < 0) {
        //     System.out.println("10 is less than 10");
        // } else if (result == 0) {
        //     System.out.println("10 is equal to 10");
        // } else {
        //     System.out.println("10 is greater than 10");
        // }

	}
}