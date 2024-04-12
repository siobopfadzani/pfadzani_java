public class Inheritance41{
    Private void test(){
        System.out.println("test");
    }
}
class Inheritance42 extends Inheritance41{
    void test()
    {
        System.out.print("test");
    }
}
class Inheritance43 extends  Inheritance42{
    protected void test(){
        System.out.println("test");
    }
}
class INheritance44 extends Inheritance43{
    public  void test(){
        System.out.println("test");
    }
}