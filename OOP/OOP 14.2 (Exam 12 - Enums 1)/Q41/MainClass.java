public class MainClass
{
	public static void main(String[]args)
	{
		MyEnums myEnum1 = MyEnums.AAA;
		MyEnums.Enums MyEnums2 = MyEnums.AAA;
		System.out.println(myEnum1 == myEnum2);
	}

}