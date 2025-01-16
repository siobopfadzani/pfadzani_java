package Challenge3;

import java.io.*;

public class Main3{
	public static void main(String[]args) throws IOException
	{
		System.out.println("in main before ");
		interface2.method2();
		System.out.println("in main after");
	}
}
interface interface1
{
	static void method1()throws InterruptedException //part of IOExceptions
	{
		System.out.println("in interface1");
		throw new InterruptedException();
	}
}
interface interface2 extends interface1
{
	static void method2()throws NoClassDefFoundError //Part of NoClassDefFoundError or LinkedError
	{
		System.out.println("in interface2");
		throw new NoClassDefFoundError();
	}
}