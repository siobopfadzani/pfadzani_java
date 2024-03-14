public class Display
{
    public void display()
    {
        System.out.print("Display.display");
    }

}
class Monitor extends Display
{
    public void display()
    {
        System.out.print("Display.display monitor");
    }
    public  long pixelCount()
    {
        display();
        return 1024 * 768;
    }
}

