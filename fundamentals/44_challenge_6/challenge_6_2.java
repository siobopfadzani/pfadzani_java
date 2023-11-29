public class StringManipulation 
{
    public static void main(String[] args) 
    {
        String num_string = "1,2,3,4,5,6,7,\n,2,3,4,2,5,5";

        String[] myArray = num_string.split("\n");

        String[][] multi_myArray = new String[myArray.length][];

        for (int i = 0; i < myArray.length; i++) 
        {
           multi_myArray[i] = myArray[i].split(",");
        }

        // Original array
        System.out.print("Original Array: ");
        for (int i = 0; i < multi_myArray.length; i++)
        {
            for (int j = 0; j < multi_myArray[i].length; j++)
            {
                System.out.print(multi_myArray[i][j] + " ");
            }
        }

    //iterate through the Array while sorting the array using bubble sort
        
        for (int i = 0; i < multi_myArray.length; i++)
        {
            for (int j = 0; j < multi_myArray[i].length - 1; j++)
            {
                for (int k = 0; k < multi_myArray[i].length - j - 1; k++)
                {
            // Check if the strings are not empty before parsing
                    if (!multi_myArray[i][k].isEmpty() && !multi_myArray[i][k + 1].isEmpty()) 
                    {
                        if (Integer.parseInt(multi_myArray[i][k]) > Integer.parseInt(multi_myArray[i][k + 1]))
                        {
                            String temp = multi_myArray[i][k];
                            multi_myArray[i][k] = multi_myArray[i][k + 1];
                            multi_myArray[i][k + 1] = temp;
                        }
                    }
                }
            }
        }


        // Print the sorted array
        System.out.print("\nSorted Array  : ");
        for (int i = 0; i < multi_myArray.length; i++)
        {
            for (int j = 0; j < multi_myArray[i].length; j++)
            {
                System.out.print(multi_myArray[i][j] + " ");
            }
        }
    }
}
