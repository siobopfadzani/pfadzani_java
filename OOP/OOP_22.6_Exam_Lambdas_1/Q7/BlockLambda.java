class BlockLambda
{
	interface LambdaFunction
	{
		String intKind(int a);
	}

	public static void main(String[]args)
	{
		LambdaFunction lambdafunction = (int i) ->{if((i % 2) == 0) return "even";
		else return "odd";
		};
		System.out.println(lambdafunction.intKind(10));
	}
}