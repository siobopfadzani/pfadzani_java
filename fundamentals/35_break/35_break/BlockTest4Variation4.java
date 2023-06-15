public class BlockTest4 {
    public static void main(String[] args) {
        System.out.println("Step 1");

        label1: {
            System.out.println("Step 2");

            label2: {
                System.out.println("Step 3");
                break label2; 
            }

            System.out.println("Step 7");
        }

        System.out.println("Step 8");
        System.out.println("Step 9");
    }
}


