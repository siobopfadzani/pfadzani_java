package Lambdas8;

public class MainClass {
    public static void main(String[] args) {
        StringCustomer stringCustomer = (a) ->{
            return a;
        } ;

        String b = stringCustomer.stringConsumer("a am a consumer");
        System.out.println(b);
    }
}
