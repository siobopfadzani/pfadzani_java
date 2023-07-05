public class BubbleSortTest {

    public static void main(String[] args) {
        int arr[] = {100, 50, 70, 40, 20, 30, 10, 15, 76, 1,2,0,5,6};
         bubblesort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void bubblesort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
        
            for (int j = 0; j < arr.length - i - 1; j++) {
            
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    
                }
            }
        }
    }
}

