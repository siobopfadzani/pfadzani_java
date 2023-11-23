
public class myArrayay_Challenge3
{
	public static void main(String[] args)
	{
      // Declaration and initialize of a pre-populated int myArrayay of size 50
        int[] myArray = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
            41, 42, 43, 44, 45, 46, 47, 48, 49, 50
        };
        
      //for loop to iterate through the populated Array
        int i = 0;
        while (i < myArray.length)
		    {
          myArray[i] = myArray[i] + 1;

			     switch (myArray[i] % 11)
			      {
			       	case 0:
                  System.out.println("myArray "+  myArray[i]);
                  break;

              default :
                 break;
		        }

            i += 2;
        }
    }
}
