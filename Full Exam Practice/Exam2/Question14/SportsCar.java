package Exam2.Question14;
class Car{
    public int gearRatio =8;
    public String accelerate(){return "Accelerate : car ";}
}
public class SportsCar extends Car{
    public int gearRatio = 9;
    public String accelerate(){return " Accelerate : sportsCar";}
    public static void main(String[] args) {
        Car c = new SportsCar();
        System.out.println(c.gearRatio + "  " + c.accelerate());
    }
    
}
