public class ArrayCopy3 {

   public static void main(String[] args) {

        int arr2[] = {1,2,3,4,5,6,7,7,88,10};
        int []arr = new int[10];
       System.arraycopy( arr2, 7, arr, 7, 2 );
        for(int i =0;i<arr.length;i++)
        {
            System.out.println("arr values = "+arr[i]);
        }
   }
}
