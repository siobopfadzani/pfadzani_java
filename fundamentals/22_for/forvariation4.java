public class ForTest1 {
    public static void main(String[] args) {
        for(int i = 0;i <=100;i+=5){
        if(i>2){
            System.out.println("Numbers = "+i);
            }else if(i<2){
            System.out.println("Numbers = "+i);
            continue;
            }
        }
    }
}

