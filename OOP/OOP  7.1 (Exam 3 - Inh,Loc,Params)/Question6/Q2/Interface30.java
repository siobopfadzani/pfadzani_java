public class Interface30 implements Interface31,Interface32,Interface33
{
    public void test01()
    {
        System.out.println("Test1");
    }
    public  void test02(){
        System.out.println("Test2");
    }
    public  void test03(){
        System.out.println("Test3");
    }
    public static  void main(String[]args)
    {
        Interface30 inter = new Interface30();
        inter.test01();
        inter.test03();
        inter.test02();
    }
}
