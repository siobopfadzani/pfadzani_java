class LambdaFunctionTest
{
	@FunctionalInterface
	interface LamdaFunction
	{
		int apply(int j);
		// boolean equals(java.lang.Object arg0);
	}
	public static void main(String[]args)
	{
		LamdaFunction lamdaFunction = i -> i*i;
		System.out.println(lamdaFunction.apply(10));
	}
}