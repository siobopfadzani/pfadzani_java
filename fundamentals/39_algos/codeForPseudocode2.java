import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Integer[][] array = new Integer[10][50];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                array[i][j] = generateRandomNumber();
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(array[i][j]+"");
            }
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            Arrays.sort(array[i]);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static Integer generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); 
    }
}

