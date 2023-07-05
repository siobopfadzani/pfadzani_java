import java.util.Random;
public class Quicksort {
   public static void main(String[] args) {
      Random rand = new Random();
      int[] numbers = new int[10];
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = rand.nextInt(100);
      }
      
      System.out.println("Before sorting:");
      printArray(numbers);
      quicksort(numbers, 0, numbers.length - 1);
      
      System.out.println("\nAfter sorting:");
      printArray(numbers);
   }
   public static void quicksort(int[] arr, int low, int high) {
      if (low < high) {
         int partitionIndex = partition(arr, low, high);
         quicksort(arr, low, partitionIndex - 1);
         quicksort(arr, partitionIndex + 1, high);
      }
   }
   public static int partition(int[] arr, int low, int high) {
      int pivot = arr[high]; 
      int i = low - 1; 
      
      for (int j = low; j < high; j++) {
         if (arr[j] <= pivot) {
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
         }
      }
      int temp = arr[i + 1];
      arr[i + 1] = arr[high];
      arr[high] = temp;
      
      return i + 1; 
   }
   public static void printArray(int[] arr) {
      for (int num : arr) {
         System.out.print(num + " ");
      }
      System.out.println();
   }
}

