public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 4; i++) {
      for (int j = 1; j < 7; j++) {
        // when value of j becomes 4, this loop terminates
        if (j == 4) {
          break;
        }
        System.out.println(j + " ");
      }
      System.out.println("\nEnd of inner loop"); 
      // control comes here after breaking from inner loop
    }
    System.out.println("End of outer loop");
  }
}
