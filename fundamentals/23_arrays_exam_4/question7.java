import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int arr1[] = {1, 2, 34, 5, 5};

        // Method 1: Using a for loop to copy elements from arr1 to arr
        System.out.println("Method 1: Using a for loop");
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (k < arr1.length) {
                    arr[i][j] = arr1[k];
                    k++;
                } else {
                    break;
                }
            }
        }
        displayArray(arr);

        // Reset arr for the next method
        resetArray(arr);

        // Method 2: Using Arrays.copyOf to copy elements from arr1 to arr
        System.out.println("Method 2: Using Arrays.copyOf");
        int[] flattenedArr = Arrays.copyOf(arr1, arr.length * arr[0].length);
        for (int i = 0; i < flattenedArr.length; i++) {
            arr[i / arr[0].length][i % arr[0].length] = flattenedArr[i];
        }
        displayArray(arr);

        // Reset arr for the next method
        resetArray(arr);

        // Method 3: Using System.arraycopy to copy elements from arr1 to arr
        System.out.println("Method 3: Using System.arraycopy");
        System.arraycopy(arr1, 0, arr[0], 0, arr1.length);
        displayArray(arr);

        // Reset arr for the next method
        resetArray(arr);

        // Method 4: Using arr1.clone to copy elements from arr1 to arr
        System.out.println("Method 4: Using arr1.clone");
        arr[0] = arr1.clone();
        displayArray(arr);
    }

    // Helper method to display the contents of a 2D array
    private static void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("--------");
    }

    // Helper method to reset the content of a 2D array to zeros
    private static void resetArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.fill(array[i], 0);
        }
    }
}
