public class myclass {
    public static void main(String[] args) {
        int a = 2;
        
        for (; a == 2;) {
            if (a == 1) {
                System.out.println("pfadzani");
                continue;
              
            }
            else if (a == 2) {
                System.out.println("siobo");
               break;
               
            }
            else {
                break;
            }
        }
    }
}

