public class BreakTest3 {
    public static void main(String[] args) {
       int i = 0;
        while(i < 9){
        i++;
            if(i == 7){
                continue;
            }
           
            System.out.println("outer:"+i);
        }
    }           
}

