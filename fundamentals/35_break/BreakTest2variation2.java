public class BreakTest2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int k = 0;

        outer: do {
            while (i < 3) {
                System.out.println("outer: " + i);
                i++;

                inner: while (j < 3) {
                    System.out.println(" inner: " + j);
                    j++;

                    if (i == 2) {
                        break outer;
                    }

                    innest: while (k < 3) {
                        System.out.println("  innest: " + k);
                        k++;
                    }
                    k = 0;
                }
                j = 0;
            }
        } while (i < 3);
    }
}

