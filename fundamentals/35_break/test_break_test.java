public class ContinueExample {
    public static void main(String[] args) {
        // Using a for loop to iterate from 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Check if the current value of i is 3
            if (i == 3) {
                // If i is 3, skip the rest of the code inside the loop for this iteration
                continue;
            }

            // Print the current value of i if it's not 3
            System.out.println("Current value of i: " + i);
        }
    }
}
