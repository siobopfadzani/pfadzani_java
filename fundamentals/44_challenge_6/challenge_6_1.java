public class StringManipulation {
    public static void main(String[]args) {

        //String varible and conversion of the string to an array

        String line = "1,4,3,2,3,7,5,6,9";

        System.out.println("original string " + line);


        String []converted_Array1 = line.split(",");

        int[] converted_Array = new int[converted_Array1.length];

        for (int i = 0; i < converted_Array.length; i++) {
            converted_Array[i] = Integer.parseInt(converted_Array1[i]);
        }

        System.out.print("Original array ");
        for (int i = 0; i < converted_Array.length; i++) {
            System.out.print(converted_Array[i] + " ");
        }

        //bubble sort

        for (int i = 0; i < converted_Array.length - 1; i++) {

            for (int j = 0; j < converted_Array.length - i - 1; j++) {
                if ((converted_Array[j]) < (converted_Array[j + 1])) {
                    int temp = converted_Array[j];
                    converted_Array[j] = converted_Array[j + 1];
                    converted_Array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array   ");
        for (int number : converted_Array) {
            System.out.print(number + " ");
        }
        System.out.println();


    }
}
