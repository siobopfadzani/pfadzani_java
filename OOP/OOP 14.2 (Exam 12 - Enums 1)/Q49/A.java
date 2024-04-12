package Q49;

class A
{
	{
		System.out.println(1);
	}

	static
	{
		System.out.println(2);
	}

	enum Enums
	{
		A;
		{
			System.out.println(3);
		}
		static
		{
			System.out.println(4);

		}
		class B
		{
			{
				System.out.println(5);
			}
		}

	}
}