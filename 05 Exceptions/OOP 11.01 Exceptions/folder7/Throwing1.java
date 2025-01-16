public class Throwing1 {
    public static void main(String[] args) throws Exception{
        int i = 4;
        if(i > 3){
            throw new Exception("Houston we have a problem");
        }
        System.out.println("Did not throw");
    }
 }
 