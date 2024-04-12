public class TestClass {
    public static void main(String[] args) {

        int arr[][] = new int[3][];
        arr[0] = new int[1]; //Array Initialization: initializing row 0 to 1

        arr[1] = new int[2];//Array Initialization: initializing row 1 to 2
        arr[2] = new int[3];//Array Initialization: initializing row 2 to 3

        int sum = 0;
        
        for (int i = 0; i < 3; ++i)

            for (int j = 0; j < i + 1; ++j)

                arr[i][j] = j + 1;

        for (int i = 0; i < 3; ++i)

            for (int j = 0; j < i + 1; ++j)

                sum += arr[i][j];

        System.out.println(sum);

    }
}
