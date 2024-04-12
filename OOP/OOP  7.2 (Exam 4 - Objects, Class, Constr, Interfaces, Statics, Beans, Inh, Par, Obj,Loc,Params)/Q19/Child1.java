public class Child1 extends Parent
{
    public Child1()
    {
        super();
        System.out.println("child1.....");
    }
}
class Child2 extends Child1
{
    public Child2()
    {
        System.out.println("child2.....");
    }
}
