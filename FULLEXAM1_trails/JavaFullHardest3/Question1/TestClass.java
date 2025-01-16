package Question1;
import java.util.*;
public class TestClass
{
	int i = 0;
	Object prevObject;
	public void saveObject(List e)
	{
		prevObject = e;
		i++;
	}
	public static void main(String[] args) {
		TestClass test = new TestClass();
		test.saveObject(new ArrayList<>());
		test.saveObject(null);
		List l = new ArrayList<>(); test.saveObject(l);
	}
}