public class Practice {
    
    public Practice() {
        for (int val = 0; val < 10; val++) {  
            for (int val1 = 2; val1 < 10; val1 += 2) {
                System.out.println("value1 = " + val + " value2 = " + val1);
            }
        }
    }
    
    public void practice1() {
        for (int a = 0; a < 2; a++) {
            System.out.println("value for my test is " + a);
        }
    }
    
    public static void main(String[] args) {
        Practice object = new Practice();
        object.practice1();
    }
}

