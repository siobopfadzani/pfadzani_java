public class BlockTest4 {
    public static void main(String[] args) {
        System.out.println("Step 1");
       
        label1: {
            System.out.println("Step 2");
              
            label2: {
                System.out.println("Step 3");
                  
                label3: {
                
                    System.out.println("Step 4");
                     if(true){
                    break label2;
                     }
                    label4: {
                        System.out.println("Step 5");
                    }
                    
                   
                  
                    System.out.println("Step 6");
                }
                System.out.println("Step 7");
            }
              
            System.out.println("Step 8");
        }
        System.out.println("Step 9");
    }
}

