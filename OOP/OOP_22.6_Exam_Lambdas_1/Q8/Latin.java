class Latin
{
	public static void main(String[]args)
	{
		String word = "hello";
		SuffixFunction suffixFuc = ()-> System.out.println(word + "ay");
		word = "e";
		suffixFuc.call();
	}
}