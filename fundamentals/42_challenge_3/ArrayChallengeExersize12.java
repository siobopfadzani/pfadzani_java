public class myArrayay_Challenge12 {
    public static void main(String[] args) {

        int[][] Arr = new int[100][30];
        int j = 0;
        int i = 0;

        while (i < Arr.length) 
        {
            while (j < Arr[i].length) 
            {
                
                Arr[i][j] = Arr[i][j]+ i+ 1;

        // Check if the value is odd and divisible by 8

                switch(Arr[i][j])
                {
                    case 8:case 16:case 24:
                    case 32:case 40:case 48:
                    case 56:case 64:case 72:
                    case 80:case 88:case 96:
                    System.out.println("ODD and divisible by 8: " + Arr[i][j]);

                }

                j++;
            }
            i++;
            j = 0;
        }
    }
}
