package Array.Array2;

public class Array2 {
    public static void main(String[] args) {
        

        int [][] arr = new int[3][2];
        for(int i  = 0; i <arr.length;i++ )
        {
            for(int j = 0; j < arr[i].length;j++ )
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("for each");
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
            
        }
    }
    
    
}
