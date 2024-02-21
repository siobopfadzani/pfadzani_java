public class Variation11 {
    public static void main(String[]args)
    {
        String arrayString[][] = new String[1][5];
        
        String []arrStrings[]  = {{"1","2","3","4","5"}};

        for (int i = 0; i < arrayString.length;i++)
        {
            for(int j = 0; j < arrayString[i].length;j++)
            {
                arrayString[i][j] = arrStrings[i][j];
            }
        }
        System.out.println(arrayString[0][1]);
    }
    
}
