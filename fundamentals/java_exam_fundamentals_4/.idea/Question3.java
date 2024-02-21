public class Question3 {

    public static void main(String[] args) {

        String[][][] arr = {{{"a", "b", "c"}, {"d", "e", null}},{{"x"}, null},{{"y"}},{{"z", "p"}, {null,null}}};

        System.out.println(arr[3][1][0]);

        String[][][] arr1 = new String[4][4][4];

        // Copy values from arr to arr1
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++) 
            {
                if(arr[i][j] != null)
                {
                     for (int k = 0; k < arr[i][j].length; k++) 
                     {
                
                          arr1[i][j][k] = arr[i][j][k];
                          System.out.println(arr[i][j][k]);
                     }
                 }
            }
        }

        //Print values of arr1
        for (int i = 0; i < arr1.length; i++) 
        {
            for (int j = 0; j < arr1[i].length; j++) 
            {
                for (int k = 0; k < arr1[i][j].length; k++) 
                {
                    System.out.print(arr1[i][j][k]);
                }
            }
        }
    }
}
