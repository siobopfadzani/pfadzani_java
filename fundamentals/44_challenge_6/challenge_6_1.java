public class StringManipulation 
{
    public static void main(String[] args) 
    {
    
    //String varible and conversion of the string to an array

        String num_string = "10,27,35,46,54,46,87,884,94,10,11,12,13,14,15,16,17,18,19,20";

        String[] converted_Array = num_string.split(",");
        
        System.out.print(" Original array ");
        for (int i = 0; i <converted_Array.length;i++)
        {
           System.out.print(converted_Array[i]+" ");
        }

    //bubble sort

        for (int i = 0; i < converted_Array.length - 1; i++) 
        {

            for (int j = 0; j < converted_Array.length - i - 1; j++) 
            {
                if (Integer.parseInt(converted_Array[j]) > Integer.parseInt(converted_Array[j + 1])) 
                {
                    String temp = converted_Array[j];
                    converted_Array[j] = converted_Array[j + 1];
                    converted_Array[j + 1] = temp;
                }
            }
        }
        
        System.out.println();
        System.out.print(" Sorted array   ");
        for (String number : converted_Array) 
        {
            System.out.print(number + " ");
        }
    }
}
