package Array;

public class Arrays {
    public static void main(String[] args) {
        int []arr = new int[4];
        for (int i = 0; i < 4;i++) 
        {
           arr[i] = arr[i] + i;
        }
        for (int i : arr) {
            System.out.println(i);
        }
       
    }
    
}
