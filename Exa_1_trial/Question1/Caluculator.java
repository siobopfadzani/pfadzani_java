package Question1;

public class Caluculator
{
    int num = 100;
    public void calc(int num)
    {
        this.num = num * 10;

    }
    public void printnum()
    {
        System.out.println(num);
    }
    public static void main(String[] args) {
        Caluculator obj = new Caluculator();
        obj.calc(2);
        obj.printnum();
    }
}

