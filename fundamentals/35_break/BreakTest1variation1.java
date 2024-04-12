public class BreakTest1 {
    public static void main(String[] args) {
       int i =0;
        while (i < 10){
            System.out.println("outer:"+i);
            i++;
            if(i == 8){
                break;
            }
        }
    }           
}

