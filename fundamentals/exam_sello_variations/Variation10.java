public class Variation10 {
    public static void main(String[]args)
    {
        int [] arr = new int[10];
        
        for (int i = 0; i < arr.length;i++)
        {
            arr[i] = 1 + i;
        }
        switch(arr[5])
        {
            case 1:
                System.out.println(arr[0]);
                break;
            case 2:
                System.out.println(arr[2]);
                break;
            case 3:
                System.out.println(arr[3]);
                break;
            case 4:
                System.out.println(arr[4]);
                break;
            case 6:
                System.out.println(arr[5]);
                break;
            default:
                break;
        }
    }  
}
