public class Variation2 {
    public static void main(String[] args) 
    {
        int arr [][] = new int[10][10];

        for (int i = 0; i < arr.length;i++)
        {
            for (int j = 0;j < arr[i].length;j++)
            {
                if (j % 2 != 0)
                {
                    arr[i][j] = 1 + j;
                } 
            }
        }
        System.out.println(arr[0][1]);    
    }
    
}
