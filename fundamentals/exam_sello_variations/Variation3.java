public class Variation3{

    public static void main(String[]args)
    {
        int arr[] = new int[]{1,2,3,4,5,6};
        int arrCopy[] = new int[10];

        System.arraycopy(arr, 4, arrCopy,0, 1);

        System.out.print("[");

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arrCopy[i]+ " ,");
        }

        System.out.print("]");

        
    }
    
}