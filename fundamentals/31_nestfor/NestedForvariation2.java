public class Practice {
    
    public Practice() {
        for (int val = 0; val < 10; val+=2) {  
            for (int val1 = 2; val1 < 10; val1 += 2) {
                System.out.println("value1 = " + val + " value2 = " + val1);
            }
        }
    }
    
    public void Practice1() {
        for (int a = 0; a < 5; a++) {
            System.out.println("value for my test is " + a);
        }
    }
    
    public static void main(String[] args) {
        Practice object = new Practice();
        object.Practice1();
        
        
    }
}

