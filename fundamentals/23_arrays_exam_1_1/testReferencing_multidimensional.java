public class TestReferencing 
{
    public static void main(String[] args) {

        String[][] array2D = {
            {"aaa", "bbb", "ccc"},
            {"ddd", "eee", "fff"}
        };

        // Create a reference to the existing 2D array
        String[][] referenceArray = new String[array2D.length][array2D.length];
        referenceArray = array2D;
        // Access and modify the referenced array
        // referenceArray[0][0] = "modified";

        // Print the original array to see the modification
        for (String[] row : array2D) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
