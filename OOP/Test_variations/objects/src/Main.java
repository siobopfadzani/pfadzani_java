public class Main {
    public static void main(String[] args)
    {

        Bmw bmw = new Bmw();
        bmw.bmw();


        Audi.audi();
        
        Audi.audi();
        Bmw.audi();

        Nissan nissan = new Nissan();
        nissan.nissan();
        nissan.Nissan();

        CAR car = new CAR();
        int print = car.reverse(10,10);
        System.out.println(print);

    }
}