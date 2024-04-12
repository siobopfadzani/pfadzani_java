
public class test{
public static void main(String[]args){
    outerLoop: for (int i = 0; i < 3; i++) {
    innerLoop: for (int j = 0; j < 3; j++) {
        if (i == 1 && j == 1) {
            break outerLoop; // Breaks out of the outer loop
        }
        System.out.println(i + ", " + j);
        System.out.println();
    }
}


  }
}
