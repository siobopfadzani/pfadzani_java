package Q44;

import java.util.*;
public class TestClass extends TC
{
	public TestClass()
	{
		System.out.println("TestClass created");
	}
	public static void main(String[]args)
	{
		new TestClass();
	}
}

 private class TC
{
	public TC()
	{
		super();
		System.out.println("TC created");
	}
}
