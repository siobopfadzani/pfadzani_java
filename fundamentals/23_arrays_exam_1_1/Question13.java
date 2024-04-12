import java.util.*;

public class Question13
{
	public static void main(String[]args)throws Exception
	{
		ArrayList<String> al = new ArrayList <String>();
		
			al.add("111");
			al.add("222");

		System.out.println(al.get(al.size())); //throws an exception because the get method gets the element at the position where the element is, in this case bieng the size of the elemnt which is going to be two, this is outside of the index of the arraylist which is 1
		//System.out.println(al.get(al.size()-1))
	}
}