public class ShoeSizes { 
 public static void main(String[] args) {
    int[] shoeSizes = {11, 2, 33, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 20, 1, 3, 5, 10, 99, 17, 2, 3, 21, 5, 6, 7, 8, 9, 50, 13, 2, 4, 32, 7, 8, 4, 2, 6, 8, 2, 5, 43, 9, 3, 5, 88, 54, 4, 10};

        printShoeSizes(shoeSizes);
        printEvenShirtSizes(shoeSizes);
        printDivisibleByEleven(shoeSizes);
        printIncrementedShoeSizes(shoeSizes);
        printIncrementedEvenSizesDivisibleByEleven(shoeSizes);
    }

    private static void printShoeSizes(int[] sizes) {
        for (int size : sizes) {
            System.out.print(size + " ");
        }
        System.out.println();
    }

    private static void printEvenShirtSizes(int[] sizes) {
        for (int size : sizes) {
            if (size % 2 == 0) {
                System.out.println(size);
            }
        }
    }

    private static void printDivisibleByEleven(int[] sizes) {
        for (int size : sizes) {
            if (size % 11 == 0) {
                System.out.println(size);
            }
        }
    }

    private static void printIncrementedShoeSizes(int[] sizes) {
        for (int size : sizes) {
            System.out.print(size + 1 + " ");
        }
        System.out.println();
    }

    private static void printIncrementedEvenSizesDivisibleByEleven(int[] sizes) {
        for (int size : sizes) {
            int incrementedSize = size + 1;
            if (incrementedSize % 2 == 0 && incrementedSize % 11 == 0) {
                System.out.println(incrementedSize);
            }
        }
    }
}


