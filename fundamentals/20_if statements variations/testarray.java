public class Main {

  public static void main(String[] args) {
    int totalRows = 5, totalCols = 5;
    // Declaring a 2D array
    int[][] matrix = new int[totalRows][totalCols];

    /* for loop to fill diagonal values */
    for (
      int row = 0, col = 0;
      row < totalRows && col < totalCols;
      row++, col++
    ) {
      matrix[row][col] = 1;
    }

    // Printing matrix
    for (int i = 0; i < totalRows; i++) {
      for (int j = 0; j < totalCols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
