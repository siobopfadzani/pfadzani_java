public class SportsCar extends Car{
    public static  int gearRatio = 9;
    public static  String accelerate(){return "Accelarate : SportsCar";}
//    public int changeA(){return gearRatio =10;}
    public static void main(String[]args)
    {
        Car c = null;
        System.out.println(c.gearRatio + " " +c.accelerate());

    }
}
