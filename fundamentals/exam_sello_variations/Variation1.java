public class Variation1{

    public static void main(String[]args)
    {
        long arr[] = null; 
        int arrCopy[] = new int[10];

        System.arraycopy(arr, 0, arrCopy,0, 6);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arrCopy[i]);
        }
        
    }
    
}
