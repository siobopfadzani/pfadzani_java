public class ArraysLightning1{

    public static void main(String [] args)
    {
        int counter = 15;
        int[][] populatedArray = {{1,2,3,4,5,6,7,8,8,9,0,6,4},{3,5,6,9,9,9,5,3,5,7,8,9}};

        ArraysLightning1.count("array 1 ",populatedArray);
        ArraysLightning1.count("array 2 ",populatedArray);
        ArraysLightning1.count("array 3 ",populatedArray);
        ArraysLightning1.count("array 4 ",populatedArray);
        ArraysLightning1.count("array 5 ",populatedArray);
        ArraysLightning1.count("array 6 ",populatedArray);
        ArraysLightning1.count("array 7 ",populatedArray);
        ArraysLightning1.count("array 8 ",populatedArray);
        ArraysLightning1.count("array 9 ",populatedArray);
        ArraysLightning1.count("array 10 ",populatedArray);

    }
    public static void count(String prefix, int[][] max)
    {
         System.out.print(prefix);
        int i = 0;
        int j = 0;
        System.out.print("[");
        while(i < max.length)
        {
            while(j < max[i].length)
            {
                
                System.out.print(max[i][j]);
               
                j++;
            }i++;
        }
        System.out.print("]");
        System.out.println();

    }

}

