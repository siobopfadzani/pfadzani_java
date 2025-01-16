package Q27;

class MainClass
{
    int i;
    public MainClass(int x)
    {this.i = x;}
}
class B extends MainClass
{
    int j;
    public B(int x,int y)
    {
        super(x);
        this.j = y;

    }
    B(int y)
    {
        this(y, y);
        j= y;
    }
} 