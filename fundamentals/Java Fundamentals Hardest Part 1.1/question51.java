public class question51 {
    public static void main(String[] args) {
        int x = 0;

        label:
        for (int i = 0; i < 4; i++) {
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++)
                    if (++x > 20 && (x / 1 < 10)) {
                        System.out.println("bishal");
                        continue label;
                    } else {
                        System.out.println("geeks");
                    }
            }
        }
    }
}
