import java.util.*;

public class Question14
{
	public static void main(String[]args)throws Exception
	{
		int[]i[] = {{1,2},{1},{},{1,2,3}};
		// int i[] = new int[2]{1,2}; illegal declaration of an array, you cannot instantiate the size and also populate the array
		int i1[][] = new int[][]{{1,2,3},{4,5,6}};
		int i2[][] = {{1,2},new int[2]};
		// int i3[4] ={1,2,3,4}; //illegal declaration of the array. in java you cannot initialize the size of the array in the begining of the declaration
	}
}