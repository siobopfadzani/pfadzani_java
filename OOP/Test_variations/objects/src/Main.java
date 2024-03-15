public class Main {
    public static void main(String[] args)
    {
        Bmw bmw = new Bmw();
        bmw.bmw();

        Audi.audi();

        Nissan nissan = new Nissan();
        nissan.nissan();

        CAR car = new CAR();
        int print = car.reverse(10,10);
        System.out.println(print);

    }
}