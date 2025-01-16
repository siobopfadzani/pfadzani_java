package Q18;

public class Nested51 {
    protected int a = 7;

    public void display()
    {
        System.out.println("Value of a is " + a);

    }
    class Nested52
    {
        protected int a = 6;
        public void display()
        {
            System.out.println("value of a in the inner " + Nested51.this.a);
        }
    }
}
