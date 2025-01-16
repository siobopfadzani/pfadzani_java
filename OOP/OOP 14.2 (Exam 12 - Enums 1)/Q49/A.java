package Q49;

class A
{
	
	public static void main(String[] args) {
		String a = new String("a");
		String b = new String("a");

		boolean result = a.compareTo(b);
		System.out.println(result);

		a.concat(b);
		result = a.equals(b);
		System.out.println(result);
	}
}